package Lab6.Ex2;

public class BankEmpl implements Person {

    static String str = "Россельхозбанк";

    static void getInfo() // Вызов из класса Работник банка
    {
        System.out.println("Работник банка:");
        System.out.println(NAME + " " + LASTNAME + ", " + str);
        System.out.println(" "); // пробел
    }
}

