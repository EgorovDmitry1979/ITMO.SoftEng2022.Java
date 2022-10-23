package Lab4.Part2.Ex3;

// Часть 2. у.3. Написать метод, который меняет местами первый и последний элемент массива

import java.util.Arrays;

public class ReArray {
    public static void main(String[] arg) {
        int[] array = new int[4]; // создание массива

        array[0] = 5;
        array[1] = 6;
        array[2] = 7;
        array[3] = 2;

        System.out.println("Array 1: " + Arrays.toString(array));

        GetArray(array); // вызов метода чтобы поменять местами первый и последний элементы

        System.out.println("Array 2: " + Arrays.toString(array));
    }

    public static void GetArray(int[] array){
        int a = array[0];
        int b = array[array.length-1];

        int[] array1 = new int[4]; // создание массива
        array[0] = b;
        array[array.length-1] = a;
    }
}
