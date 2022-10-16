package Lab1;
import java.util.Scanner; // позволяет использовать класс Scanner

public class Lab1Ex6
{
    public static void main(String[] args)
    {
        System.out.println("6) Проверка целого числа на четность и на выход за пределы диапазона");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int b = scanner.nextInt(); // передать целое число

        if ( b % 2 == 0 && b <= 100 ) // = остаток от деления числа b на 2 равен 0
            System.out.println("Число " + b + " чётное");
        else if (b % 2 == 0 && b > 100)
            System.out.println("Число " + b + " чётное, но выходит за пределы диапазона");
        else
            System.out.println("Число " + b + " нечётное");
    }
}
