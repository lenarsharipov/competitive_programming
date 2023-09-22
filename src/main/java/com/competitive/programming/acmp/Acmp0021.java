package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.max;

/**
 * https://acmp.ru/?main=task&id_task=21
 */
public class Acmp0021 {
    void solve(Scanner in, PrintWriter out) {
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        out.println(max(first, max(second, third)) - min(first, min(second, third)));
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0021().run();
    }
}
