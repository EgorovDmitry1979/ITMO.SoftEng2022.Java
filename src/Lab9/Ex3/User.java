package Lab9.Ex3;

import java.util.Map;
import java.util.Scanner;

public class User {
    private String name;

    public User() // конструктор
    {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void tableResults(Map<User, Integer> gameResult) {
        System.out.println(" "); // пробел
        System.out.println("Введите имя игрока: \"Suvi\", \"Juha\", \"Kaija\", \"Lauri\" или \"Pekka\"");
        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();
        for(Map.Entry<User, Integer> entry : gameResult.entrySet()){
            if(entry.getKey().getName().equals(console)){
                System.out.println(console + " - " + entry.getValue() + " очков");
            }
        }
    }

}
