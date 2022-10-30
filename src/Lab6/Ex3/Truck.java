package Lab6.Ex3;

import java.util.Scanner;

public class Truck extends Car {

    private int numberWheels;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberWheels, int maxWeight){
        super(weight, model, color, speed);
        this.numberWheels = numberWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels() // устанавливает новое значение в поле «количество колес» и выводит в консоль.
    {
        this.numberWheels = numberWheels;
        System.out.println("NewWheels: количество колес - " + numberWheels);
        System.out.println(" "); // пробел
    }

    @Override
    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + " кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("количество колес - " + numberWheels + " и максимальный вес - " + maxWeight);
    }
}
