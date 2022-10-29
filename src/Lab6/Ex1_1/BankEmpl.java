package Lab6.Ex1_1;

public class BankEmpl extends Person {

    String str = "Россельхозбанк";

    public BankEmpl(String Name, String LastName, String str) {
        super(Name, LastName);
        this.str = str;
    }

    public BankEmpl() {
        super();
        System.out.println("Работник банка:");
        System.out.println(Name + " " + LastName + ", " + str);
    }
}
