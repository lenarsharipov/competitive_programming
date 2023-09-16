package com.competitive.programming.acmp;

import java.util.Scanner;
import java.io.*;

/**
 * https://acmp.ru/index.asp?main=task&id_task=1
 * A+B
 * (Время: 1 сек. Память: 16 Мб Сложность: 2%)
 * Требуется сложить два целых числа А и В.
 *
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записаны
 * два натуральных числа через пробел. Значения чисел не превышают 109.
 *
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно
 * вывести одно целое число — сумму чисел А и В.
 *
 * Пример
 * №	INPUT.TXT	OUTPUT.TXT
 * 1	2 3	        5
 */
public class Acmp0001 {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a + b;
        out.println(s);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0001().run();
    }

}
