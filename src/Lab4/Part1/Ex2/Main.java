package Lab4.Part1.Ex2;

// Часть 1. п.2. Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5
// и на то и другое (то есть и на 3 и на 5).

public class Main {
    public static void main(String[] arg) {
        int a;
        for (a = 1; a < 101; a++) {
            if ((a % 3 == 0 && a % 5 == 0)) {
                System.out.println(a + " делится и на 3 и на 5");
            } else if (a % 3 == 0) {
                System.out.println(a + " делится на 3");
            } else if (a % 5 == 0) {
                System.out.println(a + " делится на 5");
            }
        }
    }
}