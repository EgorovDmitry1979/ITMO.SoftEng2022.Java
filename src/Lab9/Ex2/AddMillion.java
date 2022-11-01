package Lab9.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddMillion {

    static int number = 1000_000; // задаем количество элементов
    static int choice = number / 10; // выборка из коллекции элементов

    public static <j> List<Integer> addAL() // коллекция ArrayList
    {
        List<Integer> arrayAL = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            arrayAL.add((int) (Math.random() * number));
        }
        System.out.println(arrayAL);

        List<Integer> arrayAL2 = new ArrayList<>(); // выборка из ArrayList
        for (int i = 0; i < choice; i++) {
            int j = new Random().nextInt(number);
            arrayAL2.add(arrayAL.get(j));
        }
        System.out.println(arrayAL2);
        return arrayAL;
    }

    public static void addLL() // коллекция Linked
    {
        List<Integer> arrayLL = new java.util.LinkedList<>();
        for (int i = 0; i < number; i++) {
            arrayLL.add((int) (Math.random() * number));
        }
        System.out.println(arrayLL);

        List<Integer> arrayLL2 = new java.util.LinkedList<>(); // выборка из Linked
        for (int i = 0; i < choice; i++) {
            int j = new Random().nextInt(number);
            arrayLL2.add(arrayLL.get(j));
        }
        System.out.println(arrayLL2);
    }
}







