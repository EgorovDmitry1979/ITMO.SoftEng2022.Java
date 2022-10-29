package Lab6.Ex1_2;

public class Client extends Person {
    static String str = "Сбербанк";

    public static void getInfo() // Вызов из класса Клиент
    {
        System.out.println("Клиент:");
        System.out.println(Name + " " + LastName + ", " + str);
        System.out.println(" ");// пробел
    }
}
