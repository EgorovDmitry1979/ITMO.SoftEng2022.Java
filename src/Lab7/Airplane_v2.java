package Lab7;

import java.util.Scanner;

public class Airplane_v2 {

    public void toScreen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вес первого крыла:");
        int weight1 = scanner.nextInt(); // ввести вес первого крыла

        System.out.println("Введите вес второго крыла:");
        int weight2 = scanner.nextInt(); // ввести вес первого крыла

        Airplane_v2.Wing wing1 = new Airplane_v2.Wing();
        Airplane_v2.Wing wing2 = new Airplane_v2.Wing();

        wing1.WeightToScreen("Вес первого крыла: " + weight1); // метод WeightToScreen
        wing2.WeightToScreen("Вес второго крыла: " + weight2); // метод WeightToScreen
    }

    class Wing {
        private int wingWeight;

        public void Wing(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void WeightToScreen(String wing) // метод для вывода веса крыла
                // является встроенным методом метода toScreen()
        {
            System.out.println(wing + wingWeight);
        }

    }
}