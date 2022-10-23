package Lab3.Ex3;

import java.util.Date; // для применения Date

// Создание класса Дом
public class House {
    private int numberOfFloors; // количество этажей
    private int yearOfConst; // год постройки
    private String name; // наименование

    // Конструктор со всеми параметрами
    public House(int numberOfFloors, int yearOfConst, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearOfConst = yearOfConst;
        this.name = name;
    }

    // Метод для установки всех значений
    public void setHouse(int numberOfFloors, int yearOfConst, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearOfConst = yearOfConst;
        this.name = name;
    }

    // Метод для вывода всех значений;
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getYearOfConst() {
        return yearOfConst;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", yearOfConst=" + yearOfConst +
                ", name='" + name + '\'' +
                '}';
    }

    // Метод, возвращающий количество лет с момента постройки
    public static int houseAge() {
        int thisYear; // текущий год
        thisYear = 2022; // ручная инициализация текущего года
        return thisYear;
    }
}
