package Lab4.Part1.Ex1;

// Часть 1. п.1. Написать программу, которая выводит на консоль нечетные числа от 1 до 99.
// Каждое число печатается с новой строки.

public class Main {
    public static void main(String[] arg) {
        int a;
        for (a = 1; a < 100; a++) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
        }
    }
}