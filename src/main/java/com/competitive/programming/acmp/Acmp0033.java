package com.competitive.programming.acmp;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://acmp.ru/?main=task&id_task=33
 * Два бандита
 * (Время: 1 сек. Память: 16 Мб Сложность: 4%)
 * Бандиты Гарри и Ларри отдыхали на природе. Решив пострелять,
 * они выставили на бревно несколько банок из-под кока-колы (не больше 10).
 * Гарри начал простреливать банки по порядку, начиная с самой левой,
 * Ларри — с самой правой. В какой-то момент получилось так, что они
 * одновременно прострелили одну и ту же последнюю банку.
 *
 * Гарри возмутился и сказал, что Ларри должен ему кучу денег за то,
 * что тот лишил его удовольствия прострелить несколько банок.
 * В ответ Ларри сказал, что Гарри должен ему еще больше денег
 * по тем же причинам. Они стали спорить кто кому сколько должен,
 * но никто из них не помнил сколько банок было в начале,
 * а искать простреленные банки по всей округе было неохота.
 * Каждый из них помнил только, сколько банок прострелил он сам.
 *
 * Определите по этим данным, сколько банок не прострелил Гарри
 * и сколько банок не прострелил Ларри.
 *
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записано
 * 2 числа — количество банок, простреленных Гарри и Ларри соответственно.
 *
 * Выходные данные
 * В файл OUTPUT.TXT выведите 2 числа — количество банок,
 * не простреленных Гарри и Ларри соответственно.
 *
 * Пример
 * №	INPUT.TXT	OUTPUT.TXT
 * 1	4 7	        6 3
 */
public class Acmp0033 {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int total = a + b - 1;
        out.println((total - a) + " " + (total - b));
    }

    void run() {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Acmp0033().run();
    }
}
