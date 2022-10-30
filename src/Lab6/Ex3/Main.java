package Lab6.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(2300, "Toyota", 'b', 180);
        car.outPut();

        Truck truck = new Truck(12000, "Mercedes", 'w', 120, 10, 28000);
        truck.newWheels();
        truck.outPut();
    }
}
