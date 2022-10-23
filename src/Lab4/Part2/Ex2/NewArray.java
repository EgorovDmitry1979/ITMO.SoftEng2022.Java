package Lab4.Part2.Ex2;

import java.util.Scanner; // позволяет использовать класс Scanner
import java.util.Arrays;

public class NewArray {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int n1 = scanner.nextInt(); // ввести длину массива
        int[] array = new int[n1]; // создание массива

        for (int i = 0; i < n1; i++) {
            System.out.println("Введите элемент массива");
            int n2 = scanner.nextInt(); // ввод элемента массива
            array[i] = n2;
        }
        System.out.println("Ввод массива закончен");
        System.out.println("Result " + Arrays.toString(array)); // вывод массива в строку
    }
}
