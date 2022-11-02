package Lab9.Ex3;

import Lab7.Airplane_v2;

import java.util.*;

public class User {
    private String name;

    public User(String name) // конструктор
    {
        this.name = name;
    }

    public String getName() // геттер
    {
        return name;
    }

    public void setName(String name) // сеттер
    {
        this.name = name;
    }

    public static void Game() {
        Map<String, Integer> Follout4 = new HashMap<>();

        // Map для хранения результатов игры Follout4
        Follout4.put("Juha", 12345);
        Follout4.put("Suvi", 1254);
        Follout4.put("Annika", 1445425);
        Follout4.put("Samuli", 15626);
        Follout4.put("Jenni", 124456);

        System.out.println(""); // пробел
        System.out.println("Таблица результатов игроков для сравнения:"); // пробел
        System.out.println(Follout4);
        System.out.println(""); // пробел

        Scanner scanner = new Scanner(System.in);
        // По факту имя пользователя - это "ключ"
        System.out.println("Напишите имя пользователя: \"Juha\", \"Suvi\", \"Annika\", \"Samuli\" , \"Jenni\"");
        String target = scanner.nextLine(); // ввести цель для сравнения в коде

        Integer integer = Follout4.get(target);
        System.out.println(target + " " + integer); // получение количества очков по имени игрока
    }
}
