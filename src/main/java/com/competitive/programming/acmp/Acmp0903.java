package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://acmp.ru/asp/do/?main=task&id_course=1&id_section=1&id_topic=26&id_problem=144
 *
 * Бисер
 * (Время: 1 сек. Память: 16 Мб Сложность: 2%)
 * В шкатулке хранится разноцветный бисер (или бусины). Все бусины имеют одинаковую форму,
 * размер и вес. Бусины могут быть одного из N различных цветов. В шкатулке много бусин каждого цвета.
 *
 * Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так,
 * чтобы среди них гарантированно были две бусины одного цвета.
 *
 * Входные данные
 * Входной файл INPUT.TXT содержит одно натуральное число N - количество цветов бусин (1 ≤ N ≤ 109).
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите ответ на поставленную задачу.
 *
 * Пример
 * №	INPUT.TXT	OUTPUT.TXT
 * 1	3	4
 */
public class Acmp0903 {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.println(n + 1);
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0903().run();
    }
}
