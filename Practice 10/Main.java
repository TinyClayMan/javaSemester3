package com.company;

public class Main {
    public static int numbersSum(int len, int sum, int k, int s) {
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += numbersSum(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int twoZeroes(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return twoZeroes(a, b - 1) + twoZeroes(a - 1, b - 1);
    }

    public static String numbersLeftToRight(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return numbersLeftToRight(n / 10) + " " + n % 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(numbersSum(0, 0, 2, 5));
        System.out.println(twoZeroes(1, 5));
        System.out.println(numbersLeftToRight(123));
    }
}
