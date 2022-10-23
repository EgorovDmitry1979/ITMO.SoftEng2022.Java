package Lab4.Part1.Ex4;

import java.util.Scanner;

// Часть 1. п.4. Напишите программу, которая принимает от пользователя три целых числа
// и возвращает true, если второе число больше первого числа, а третье число больше второго числа.

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int n1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int n2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int n3 = scanner.nextInt();

        boolean m;
        if (m = (n1 < n2 && n2 < n3)) // сравнение через boolean
            System.out.println("true");
        else System.out.println("false");
    }
}