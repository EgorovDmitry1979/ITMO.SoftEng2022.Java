package Lab3.Ex2;

public class Main {
    public static void main(String[] arg) {
        SimpleClass car = new SimpleClass(Color.GREEN, 1800);
        SimpleClass bus = new SimpleClass(Color.WHITE, 4500);

        System.out.println(" "); // просто пробел
        System.out.println("характеристики автомобиля:");
        System.out.println(car);
        System.out.println("характеристики автобуса:");
        System.out.println(bus);

    }
}
