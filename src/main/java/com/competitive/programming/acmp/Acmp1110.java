package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Acmp1110 {
    void solve(Scanner in, PrintWriter out) {
        out.println(in.nextInt() % 10);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp1110().run();
    }
}
