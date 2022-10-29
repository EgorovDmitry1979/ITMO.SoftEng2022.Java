package Lab6.Ex5;
import java.util.Scanner;

public class GetAge {
        public void Scanner() // Метод для получения возраста пользователя
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите возраст пользователя");
            int a = scanner.nextInt(); //
            System.out.println("Возраст пользователя: " + a);
            System.out.println(" "); // Пробел
        }

}
