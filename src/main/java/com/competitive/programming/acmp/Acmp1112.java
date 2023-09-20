package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Acmp1112 {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.println(n % 10 + n % 100 / 10 + n / 100);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp1112().run();
    }
}
