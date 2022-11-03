package Lab9.Ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();

        user1.setName("Suvi");
        user2.setName("Juha");
        user3.setName("Kaija");
        user4.setName("Lauri");
        user5.setName("Pekka");

        // Мапа для хранения со случайным заполнением очков
        Map<User, Integer> gameResult = new HashMap<>();

        gameResult.put(user1, (int)(Math.random()*(1000)));
        gameResult.put(user2, (int)(Math.random()*(1000)));
        gameResult.put(user3, (int)(Math.random()*(1000)));
        gameResult.put(user4, (int)(Math.random()*(1000)));
        gameResult.put(user5, (int)(Math.random()*(1000)));

//        System.out.println(gameResult);

        User.tableResults(gameResult); // запуск метода
    }
}

