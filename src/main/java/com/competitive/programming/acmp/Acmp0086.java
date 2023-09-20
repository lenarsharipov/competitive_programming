package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Acmp0086 {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.println(n * n - 3 * (n - 1) - 1);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0086().run();
    }
}
