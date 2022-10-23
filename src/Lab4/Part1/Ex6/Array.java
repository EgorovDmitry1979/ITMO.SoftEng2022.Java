package Lab4.Part1.Ex6;

import java.util.Arrays;

public class Array {
    public static void main(String[] arg) {
        int[] array = new int[5]; // создание массива

        array[0] = 0;
        array[1] = 0;
        array[2] = 3;
        array[3] = 0;
        array[4] = 0;

        System.out.println(Arrays.toString(array));

        boolean m = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 1 || array[i] == 3) {
                m = false;
                break; // обязательно, чтобы не уйти в бесконечный цикл
            }
        }
        if (m) {
            System.out.println("массив не содержит число 1 или 3");
        } else System.out.println("массив содержит число 1 или 3");
    }
}