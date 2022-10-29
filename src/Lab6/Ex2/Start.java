package Lab6.Ex2;

public class Start {
    public static void main(String[] args) {

        Person.getInfo(); // Вызов из интерфейса Человек

        Client client = new Client();
        client.getInfo(); // Вызов из класса Клиент

        BankEmpl bankEmpl = new BankEmpl();
        bankEmpl.getInfo(); // Вызов из класса Работник банка
    }
}