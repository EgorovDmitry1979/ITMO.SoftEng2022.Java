package Lab6.Ex1_1;

public class Main {
    public static void main(String[] args) {

        Lab6.Ex1_1.Person.getInfo(); // Вызов из абстрактного класса Человек

        Client client = new Client();
        client.Client(); // Вызов из класса Клиент

        BankEmpl bankEmpl = new BankEmpl();
        bankEmpl.Client(); // Вызов из класса Работник банка
    }
}