package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class Acmp1115 {
    void solve(Scanner in, PrintWriter out) {
        int pupils = in.nextInt();
        int apples = in.nextInt();
        out.println(apples / pupils + " " + (apples % pupils) + " " + ((pupils - apples % pupils) % pupils));

    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp1115().run();
    }
}
