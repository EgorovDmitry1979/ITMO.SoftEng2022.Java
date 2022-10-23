package Lab3.Ex4;

// Создайте класс Tree. Добавьте в него поля
public class Tree {
    private int age; // Возраст дерева
    private Boolean isAlive; // Живое ли дерево
    private String title; // название

    // Конструктор, который устанавливает только возраст и название
    public Tree(int age, String title) {
        this.age = age;
        this.title = title;
    }

    // Конструктор, который устанавливает все переменные в классе
    public Tree(int age, Boolean isAlive, String title) {
        this.age = age;
        this.isAlive = isAlive;
        this.title = title;
    }

    // Конструктор, который выводит сообщение «Пустой конструктор без параметров сработал»
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    // Переопределение метода
    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", title='" + title + '\'' +
                '}';
    }
}
