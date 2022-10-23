package Lab3.Ex2;


// Добавьте два объекта, установите для них значения и выведите все
// при помощи ранее созданного метода.

// Создайте простой класс, который будет иметь поля: цвет, название, вес.
public class SimpleClass {
    private Color color;
    private String name;
    private double weight;

    // Создайте метод в классе через который можно будет вывести все эти данные.
    public SimpleClass(Color color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    // Конструктор "только цвет"
    public SimpleClass(Color color) {
        this.color = color;
    }

    // Конструктор "цвет и вес"
    public SimpleClass(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    // "Пустой конструктор"
    public SimpleClass() {
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
