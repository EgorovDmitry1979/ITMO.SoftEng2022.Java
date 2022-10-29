package Lab6.Ex4;

public class Main {
    public static void main(String[] args) {

        int group = 50;

        BaseClass baseClass = new BaseClass(group); // создание объекта на основе базового класса
        baseClass.toScreen(); // основной метод базового класса

        HeirClass heirClass = new HeirClass(group); // создание объекта на основе класса-наследника
        heirClass.toScreen(); // переопределенный метод базового класса в классе-наследнике
        heirClass.toScreen1(); // собсвенный метод класса-наследника

    }
}
