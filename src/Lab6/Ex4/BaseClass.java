package Lab6.Ex4;

public class BaseClass {

    int a;

    public BaseClass(int a) // конструктор
    {
        this.a = a;
    }

    public void toScreen() {
        System.out.println("Основной метод базового класса: а = " + a);
    }
}
