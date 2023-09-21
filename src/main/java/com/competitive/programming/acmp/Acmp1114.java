package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=27&id_problem=157
 */
public class Acmp1114 {
    void solve(Scanner in, PrintWriter out) {
        int v = in.nextInt();
        int t = in.nextInt();
        int s = 109;
        out.println(((v * t) % s + s) % s + 1);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp1114().run();
    }
}
