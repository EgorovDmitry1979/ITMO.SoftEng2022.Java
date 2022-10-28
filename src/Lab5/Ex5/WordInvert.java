package Lab5.Ex5;

// у.3.	Написать метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

public class WordInvert {
    public static void main(String[] args) {

        System.out.println("Исходный текст:");
        String text = "Напишите метод, который инвертирует слова в строке.";
        System.out.println(text); // выводим неформатированный текст в строку
        System.out.println(" "); // пробел

        wi(text);
    }

    public static void wi(String text) // метод принимает на вход строку
    {
        text = text.replace(",", ""); // убираем запятые
        text = text.replace(".", ""); // убираем запятые
        text = text.trim(); // убираем пробелы спереди и сзади
        text = text.toLowerCase(); // приводим к нижнему регистру

        System.out.println("Инвертированный текст:");

        for (String newText : text.split(" ")) {
            System.out.print(new StringBuilder(newText).reverse().toString());
            System.out.print(" ");
        }
    }
}





