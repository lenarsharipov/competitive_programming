package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * https://acmp.ru/?main=task&id_task=263
 */
public class Acmp0263 {
    void solve(Scanner in, PrintWriter out) {
        int stations = in.nextInt();
        int enter = in.nextInt();
        int exit = in.nextInt();
        int res1 = abs(enter - exit);
        int res2 = stations - res1;
        out.println(min(res1, res2) - 1);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0263().run();
    }
}
