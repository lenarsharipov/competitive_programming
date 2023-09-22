package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * https://acmp.ru/?main=task&id_task=685
 */
public class Acmp0685 {
    void solve(Scanner in, PrintWriter out) {
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int b3 = in.nextInt();
        int maxA = max(a1, max(a2, a3));
        int minA = min(a1, min(a2, a3));
        int maxB = max(b1, max(b2, b3));
        int minB = min(b1, min(b2, b3));
        int midA = a1 + a2 + a3 - maxA - minA;
        int midB = b1 + b2 + b3 - maxB - minB;
        out.println(minA * minB + maxA * maxB + midA * midB);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0685().run();
    }
}
