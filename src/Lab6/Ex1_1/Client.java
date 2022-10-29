package Lab6.Ex1_1;

public class Client extends Person {
    String str = "Сбербанк";

    public Client(String Name, String LastName, String str) {
        super(Name, LastName);
        this.str = str;
    }

    public Client() {
        super();
        System.out.println("Клиент:");
        System.out.println(Name + " " + LastName + ", " + str);
        System.out.println(" ");// пробел
    }
}
