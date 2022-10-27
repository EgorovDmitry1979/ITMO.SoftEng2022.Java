package Lab5.Ex3;

// у.3.	Написать метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

public class WordReplacement {
    public static void main(String[] args) {

        String text = "Напишите метод, заменяющий в тексте все вхождения слова бяка на [вырезано цензурой]";
        System.out.println(text); // выводим неформатированный текст в строку
        System.out.println(" "); // пробел
        String biaka = "бяка";
        String noBiaka = "[вырезано цензурой]";

        wrc(text, biaka, noBiaka);
    }

    public static void wrc (String text, String biaka, String noBiaka) // метод принимает на вход 3 строки
    {
        text = text.replace(",", ""); // убираем запятые
        text = text.replace(".", ""); // убираем запятые
        text = text.trim(); // убираем пробелы спереди и сзади
        text = text.toLowerCase(); // приводим к нижнему регистру
        System.out.println(text); // выводим форматированный текст в строку
        System.out.println(" "); // пробел

        String[] array = text.split(" "); // разбиение на слова по пробелу
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(biaka)) {
                array[i] = noBiaka;
            }
            newText.append(array[i]);
            newText.append(" ");
        }
        System.out.println(newText);

    }
}




