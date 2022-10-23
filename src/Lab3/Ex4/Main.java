package Lab3.Ex4;

public class Main {

    public static void main(String[] arg) {
        Tree birch = new Tree(28, Boolean.TRUE, "birch"); // берёза
        Tree pine = new Tree(5,"pine"); // сосна
        Tree poplar = new Tree(); // тополь

        System.out.println("Берёза:");
        System.out.println(birch);

        System.out.println("Сосна:");
        System.out.println(pine);

        System.out.println("Тополь:");
        System.out.println(poplar);
    }
}
