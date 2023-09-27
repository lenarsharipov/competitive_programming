package com.competitive.programming.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Timus1327 {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        out.println((b + 1) / 2 - a / 2);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Timus1327().run();
    }
}
