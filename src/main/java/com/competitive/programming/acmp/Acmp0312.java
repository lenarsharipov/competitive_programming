package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://acmp.ru/?main=task&id_task=312
 *
 * Арифметическая прогрессия
 * (Время: 1 сек. Память: 16 Мб Сложность: 15%)
 * Заданы первый и второй элементы арифметической прогрессии. Требуется написать программу,
 * которая вычислит элемент прогрессии по ее номеру.
 *
 * Входные данные
 * Первая строка входного файла INPUT.TXT содержит три целых числа, разделенных пробелами –
 * первый элемент прогрессии A1 (1 ≤ A1 ≤ 1000), второй элемент прогрессии A2 (1 ≤ A2 ≤ 1000),
 * и номер требуемого элемента N (1 ≤ N ≤ 1000).
 *
 * Выходные данные
 * Выходной файл OUTPUT.TXT должен содержать одно целое число - N-й элемент арифметической прогрессии.
 *
 * Пример
 * №	INPUT.TXT	OUTPUT.TXT
 * 1	1 5 3	9
 * Пояснение к примеру
 * Здесь речь идет о следующей последовательности чисел:
 *
 * 1, 5, 9, 13, 17, 21, …
 * В данной последовательности D=4, поэтому A1=1, A2=A1+D=5, A3=A1+2*D=9, и т.д.
 * Поскольку нам нужно было найти 3й элемент прогрессии, то ответом на задачу является число 9.
 */
public class Acmp0312 {
    void solve(Scanner in, PrintWriter out) {
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int n = in.nextInt();
        int d = a2 - a1;
        int s = a1 + d * (n - 1);
        out.println(s);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0312().run();
    }
}
