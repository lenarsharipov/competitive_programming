package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Acmp0697 {
    void solve(Scanner in, PrintWriter out) {
        int length = in.nextInt();
        int width = in.nextInt();
        int height = in.nextInt();
        int totalM2 = height * length * 2 + width * height * 2;
        int divider = 16;
        int result = (totalM2 + divider - 1) / divider;
        out.println(result);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0697().run();
    }
}
