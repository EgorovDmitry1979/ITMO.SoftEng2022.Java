package Lab5.Ex2;

import java.util.Arrays;

// Часть 2. у.2. 2.	Написать метод, который проверяет является ли слово палиндромом.

public class Palindrom {
    public static void main(String[] args) {
        String text = " ,. Sai.ppUa,kAuPPias "; // продавец мыла (фин.)
        System.out.println("Неформатированный текст:");
        System.out.println(text); // выводим неформатированный текст в строку

        pld(text); // вызов метода для проверки на палиндромом
    }

    public static void pld(String text) {
        text = text.replace(",", ""); // убираем запятые
        text = text.replace(".", ""); // убираем запятые
        text = text.trim(); // убираем пробелы спереди и сзади
        text = text.toLowerCase(); // приводим к нижнему регистру
        System.out.println("Форматированный текст:");
        System.out.println(text);

        String text1 = new StringBuilder(text).reverse().toString();
        System.out.println("Реверсированный текст:");
        System.out.println(text1);

        if (text.equals(text1)) {
            System.out.println("слово ЯВЛЯЕТСЯ палиндромом");
        } else {
            System.out.println("слово НЕ является палиндромом");
        }
    }
}