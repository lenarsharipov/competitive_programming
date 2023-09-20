package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Acmp1116 {
    void solve(Scanner in, PrintWriter out) {
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int s1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int s2 = in.nextInt();
        out.println(h2 * 60 * 60 + m2 * 60 + s2 - s1 - h1 * 60 * 60 - m1 * 60);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp1116().run();
    }
}
