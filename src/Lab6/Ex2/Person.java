package Lab6.Ex2;

public interface Person {

    public static final String NAME = "Петя";
    public static final String LASTNAME = "Петров";

    static void getInfo() // Вызов из интерфейса
    {
        System.out.println(" ");// пробел
        System.out.println("Человек:");
        System.out.println(NAME + " " + LASTNAME);
        System.out.println(" ");// пробел
    }
}
