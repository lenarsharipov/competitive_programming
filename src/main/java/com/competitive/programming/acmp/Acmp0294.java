package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.max;

/**
 * https://acmp.ru/?main=task&id_task=294
 */
public class Acmp0294 {
    void solve(Scanner in, PrintWriter out) {
        int k1 = in.nextInt();
        int l1 = in.nextInt();
        int m1 = in.nextInt();
        int k2 = in.nextInt();
        int l2 = in.nextInt();
        int m2 = in.nextInt();

        int reminderK1 = k1 - (k1 / 100 * l1);
        int totalBoltValue = (k1 - reminderK1) * m1;

        int reminderK2 = k2 - (k2 / 100 * l2);
        int totalGaykaValue = (k2 - reminderK2) * m2;

        int val1 = (reminderK1 - reminderK2) * m1;
        int val2 = (reminderK2 - reminderK1) * m2;

        out.println(totalBoltValue + totalGaykaValue + max(val1, val2));
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0294().run();
    }
}
