package Lab4.Part1.Ex5;

import java.util.Arrays;

public class Array {
    public static void main(String[] arg) {
        int[] array = new int[5]; // создание массива

        array[0] = 3;
        array[1] = 12;
        array[2] = 49;
        array[3] = 32;
        array[4] = 9;

        System.out.println(Arrays.toString(array));

        boolean m;
        if (m = (3 == array[0] || 3 == array[array.length-1] )) // сравнение через boolean
            System.out.println("true");
        else System.out.println("false");
    }
}
