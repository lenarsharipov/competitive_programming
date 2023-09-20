package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Acmp1038 {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = 10;
        int result = (a + b - 1) / b;

        out.println(result);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp1038().run();
    }
}
