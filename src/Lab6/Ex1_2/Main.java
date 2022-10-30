package Lab6.Ex1_2;

public class Main {
    public static void main(String[] args) {

        Lab6.Ex1_2.Person.getInfo(); // Вызов из абстрактного класса Человек

        Client client = new Client();
        client.getInfo(); // Вызов из класса Клиент

        BankEmpl bankEmpl = new BankEmpl();
        bankEmpl.getInfo(); // Вызов из класса Работник банка
    }
}