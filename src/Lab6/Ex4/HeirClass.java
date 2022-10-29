package Lab6.Ex4;

public class HeirClass extends BaseClass {

    public HeirClass(int a) // конструктор для вызова конструктора родительского класса
    {
        super(a);
    }

    @Override // переопределение родительского метода BaseClass
    public void toScreen() {
        System.out.println("Переопределенный метод базового класса в классе-наследнике: a = " + a);
    }

    public void toScreen1 () // метод для класса Heir
    {
        int b = super.a;
        System.out.println("Собсвенный метод класса-наследника: a = " + b);
    }
}
