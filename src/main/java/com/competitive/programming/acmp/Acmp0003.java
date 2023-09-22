package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://acmp.ru/?main=task&id_task=3
 */
public class Acmp0003 {
    void solve(Scanner in, PrintWriter out) {
        long number = in.nextInt();
        out.println((number / 10 * (number / 10 + 1)) * 100 + 25);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0003().run();
    }
}
