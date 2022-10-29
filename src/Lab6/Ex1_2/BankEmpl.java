package Lab6.Ex1_2;

public class BankEmpl extends Person {

    static String str = "Россельхозбанк";

    public static void getInfo() {
        System.out.println("Работник банка:");
        System.out.println(Name + " " + LastName + ", " + str);
    }
}
