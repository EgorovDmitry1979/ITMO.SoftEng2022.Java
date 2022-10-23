package Lab3.Ex3;

public class Main {

    public static void main(String[] arg) {
        House house1 = new House(5, 1986, "Хрущёвка");
        House house2 = new House(12, 2016, "ЖК Лондон");

        System.out.println(""); // просто пробел

        System.out.println(house1);
        System.out.println("Возраст дома:");
        System.out.println(House.houseAge() - house1.getYearOfConst()); // метод из класса

        System.out.println(""); // просто пробел

        System.out.println(house2);
        System.out.println("Возраст дома:");
        System.out.println(House.houseAge() - house2.getYearOfConst()); // метод из класса
    }
}
