package Lab4.Part1.Ex3;

import java.util.Scanner;

// Часть 1. п.3. Написать программу, чтобы вычислить сумму двух целых чисел и вернуть true,
// если сумма равна третьему целому числу.

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
        if (m = (n1 + n2 == n3)) // сравнение через boolean
            System.out.println("true");
        else System.out.println("false");
    }
}