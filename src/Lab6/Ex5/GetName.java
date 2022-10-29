package Lab6.Ex5;

import java.util.Scanner;

public class GetName extends GetAge {
    public void Scanner() // Переопределенный метод для получения имени пользователя
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя");
        String b = scanner.nextLine(); //
        System.out.println("Имя пользователя: " + b);
    }
}
