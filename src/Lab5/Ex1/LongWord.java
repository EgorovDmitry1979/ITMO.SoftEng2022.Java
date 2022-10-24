package Lab5.Ex1;
import java.util.Arrays;

// Часть 2. у.1. Написать метод для поиска самого длинного слова в тексте

public class LongWord {
    public static void main(String[] args) {
        String text = "  Нап,исать. Метод, неоБХОдимыЙ,, для пои.сКа самОГО длиНн.ого сл,ова в ТекстE . ";
        System.out.println(text); // выводим неформатированный текст в строку

        text = text.replace(",", ""); // убираем запятые
        text = text.replace(".", ""); // убираем запятые
        text = text.trim(); // убираем пробелы спереди и сзади
        text = text.toLowerCase(); // приводим к нижнему регистру
        String[] array = text.split(" "); // разбиение на слова по пробелу

        System.out.println(Arrays.toString(array)); // вывод массива в строку
        System.out.println("Массив содержит " + array.length + " элементов"); // определяем сколько элементов содержит массив

        longWord(array);
    }

    public static void longWord(String[] array) // метод принимает на вход массив
    {
        String longWord = array[0];
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i].length() > longWord.length()) {
                longWord = array[i];
            }
        }
        System.out.println("Самое длинное слово - " + longWord);
    }
}

