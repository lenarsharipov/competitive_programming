package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://acmp.ru/?main=task&id_task=92
 * Журавлики
 * (Время: 1 сек. Память: 16 Мб Сложность: 7%)
 * Петя, Катя и Сережа делают из бумаги журавликов.
 * Вместе они сделали S журавликов. Сколько журавликов
 * сделал каждый ребенок, если известно, что Петя и Сережа
 * сделали одинаковое количество журавликов, а Катя сделала
 * в два раза больше журавликов, чем Петя и Сережа вместе?
 *
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записано
 * одно натуральное число S – общее количество сделанных журавликов (S < 106).
 *
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести три числа,
 * разделенных пробелами – количество журавликов, которые сделал каждый
 * ребенок (Петя, Катя и Сережа).
 *
 * Примеры
 * №	INPUT.TXT	OUTPUT.TXT
 * 1	6	        1 4 1
 * 2	24	        4 16 4
 * 3	60	        10 40 10
 */
public class Acmp0092 {
    void solve(Scanner in, PrintWriter out) {
        int s = in.nextInt();
        int x = s / 6;
        int kate = 4 * x;
        out.println(x + " " + kate + " " + x);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0092().run();
    }
}
