package Lab6.Ex1_1;

abstract class Person {
    static String Name = "Петя";
    static String LastName = "Петров";

    public Person() {

    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    static void getInfo() // Вызов из абстрактного метода
    {
        System.out.println(" ");// пробел
        System.out.println("Человек:");
        System.out.println(Name + " " + LastName);
        System.out.println(" ");// пробел
    }

    public Person(String name, String lastName) {
    }

    public void Client() {
    }
}
