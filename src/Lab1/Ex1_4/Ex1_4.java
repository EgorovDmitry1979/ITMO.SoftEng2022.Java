package Lab1.Ex1_4;

public class Ex1_4
{
    public static void main(String[] args)
    {
        System.out.println("1)"); // Нумерация
        System.out.println("    Я");
        System.out.println("    хорошо");
        System.out.println("    знаю");
        System.out.println("    Java");

        System.out.println("2) Посчитайте результат выражения");
        System.out.println("    (46 + 10) * (10 / 3) = " + (46+10)*(10d/3)); // добавил d
        System.out.println("    29 * 4 * (-15) = " + (29)*(4)*(-15));

        System.out.println("3)"); // Нумерация
        double number = 10500; // заменил тип int на double
        double result = (number/10)/10; // заменил тип int на double
        System.out.println("    result = " + result);

        System.out.println("4)"); // Нумерация
        double result1 = 3.6*4.1*5.9; // double для типа данных с запятой
        System.out.println("    3.6 * 4.1 * 5.9 = " + result1);
    }
}
