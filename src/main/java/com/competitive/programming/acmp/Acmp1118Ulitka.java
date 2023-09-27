package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=28&id_problem=161
 */
public class Acmp1118Ulitka {
    void solve(Scanner in, PrintWriter out) {
        int h = in.nextInt();
        int up = in.nextInt();
        int down = in.nextInt();
        int a = h - up;
        int b = up - down;
        int res = (a + b - 1) / b;
        out.println(Math.max(1, 1 + res));
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp1118Ulitka().run();
    }
}
