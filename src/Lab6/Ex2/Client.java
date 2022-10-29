package Lab6.Ex2;

public class Client implements Person {
    static String str = "Сбербанк";

    static void getInfo() // Вызов из класса Клиент
    {
        System.out.println("Клиент:");
        System.out.println(NAME + " " + LASTNAME + ", " + str);
        System.out.println(" ");// пробел
    }
}
