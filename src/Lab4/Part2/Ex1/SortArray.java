package Lab4.Part2.Ex1;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] arg) {
        int[] array = new int[5]; // создание массива

        array[0] = 1;
        array[1] = 2;
        array[2] = 6;
        array[3] = 8;
        array[4] = 35;

        System.out.println(Arrays.toString(array));

        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) // проверка отсортирован ли массив
        {
            System.out.println("OK");
        } else System.out.println("Please, try again");
    }
}
