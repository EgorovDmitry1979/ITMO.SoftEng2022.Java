package Lab7;

import java.util.Scanner; // позволяет использовать класс Scanner

public class Airplane {
    public static void main(String[] args) {
        // массив хранения названий самолетов
        String[] airplanesName = {"Airbus", "Boing", "B-52", "F-35"};
        // массив хранения весовых характеристик крыльев
        int[] wingWeightDB = {10000, 15000, 5000, 1500};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название самолета - на выбор: \"Airbus\", \"Boing\", \"B-52\", \"F-35\"");

        String target = scanner.nextLine();

        // получаем индекс самолета
        boolean m = true;
        for (int i = 0; i < airplanesName.length; i++) {
            if (m = (target.equals(airplanesName[i]))) {
                m = true;
            }
            if (m) {
                System.out.println("номер самолета в массиве " + i);
                System.out.println(" "); // пробел
                // по индексу самолета получаем вес крыла
                System.out.println("вес крыла самолета " + airplanesName[i] + " - " + wingWeightDB[i] + " кг");
            }

        }
    }
}