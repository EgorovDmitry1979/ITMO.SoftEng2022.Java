package Lab2.Ex1;

// перегруженные методы для работы с тремя типами данных - double, long и int.
public class Calculator
{
    // сложение
    public static int sum(int a, int b)
    {
        int c = a + b;
        return c;
    }
    public static long sum(long a, long b)
    {
        long c = a + b;
        return c;
    }
    public static double sum(double a, double b)
    {
        double c = a + b;
        return c;
    }
    // деление
    public static double div(int a, int b) // тип метода заменен на double
    {
        double c = a / b; // тип переменной заменен на double
        return c;
    }
    public static double div(long a, long b) // тип метода заменен на double
    {
        double c = a / b; // тип переменной заменен на double
        return c;
    }
    public static double div(double a, double b)
    {
        double c = a / b;
        return c;
    }
    // умножение
    public static int mul(int a, int b)
    {
        int c = a * b;
        return c;
    }
    public static long mul(long a, long b)
    {
        long c = a * b;
        return c;
    }
    public static double mul(double a, double b)
    {
        double c = a * b;
        return c;
    }
    // вычитание
    public static int sub(int a, int b)
    {
        int c = a - b;
        return c;
    }
    public static long sub(long a, long b)
    {
        long c = a - b;
        return c;
    }
    public static double sub(double a, double b)
    {
        double c = a - b;
        return c;
    }
}