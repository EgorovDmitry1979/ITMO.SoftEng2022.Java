package Lab5.Ex1;
import java.util.Arrays;

// Часть 2. у.1. Написать метод для поиска самого длинного слова в тексте

public class LongWord {
    public static void main(String[] args) {
        String text = "  Написать Метод, необходимыЙ для поисКа самОГО длиНного слова в Тексте . ";
        System.out.println(text); // выводим неформатированный тест в строку

        text = text.replace(",", ""); // убираем запятые
        text = text.replace(".", ""); // убираем запятые
        text = text.trim(); // убираем пробелы спереди и сзади
        text = text.toLowerCase(); // приводим к нижнему регистру
        String[] arr1 = text.split(" "); // разбиение на слова по пробелу

        System.out.println(Arrays.toString(arr1)); // вывод массива в строку
        System.out.println("Массив содержит " + arr1.length + " элементов"); // определяем сколько элементов содержит массив

        String longWord = arr1[0];
        for (int i = 0; i <= arr1.length-1; i++) {
            if (arr1[i].length() > longWord.length()) {
                longWord = arr1[i];
            }
        }
        System.out.println("Самое длинное слово - " + longWord);
    }
}

