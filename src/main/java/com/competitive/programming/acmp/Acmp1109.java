package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=26&id_problem=152
 */
public class Acmp1109 {
    void solve(Scanner in, PrintWriter out) {
        int number = in.nextInt();
        int next = number + 1;
        int prev = number - 1;
        out.println(String.format("The next number for the number %d is %d.", number, next));
        out.println(String.format("The previous number for the number %d is %d.", number, prev));
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp1109().run();
    }
}
