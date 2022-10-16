package Lab1;
import java.util.Scanner; // позволяет использовать класс Scanner

public class Lab1Ex5
{
    public static void main(String[] args)
    {
        System.out.println("5) Считывание данных при помощи класса Scanner");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 42");
        int n1 = scanner.nextInt(); // передать целое число
        System.out.println("Введите число 100");
        int n2 = scanner.nextInt(); // передать целое число4
        System.out.println("Введите число 125");
        int n3 = scanner.nextInt(); // передать целое число

        System.out.println("Результат консольного ввода");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
