package Lab5.Ex3;

import java.util.Arrays;

// у.3.	Написать метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

public class WordReplacement {
    public static void main(String[] args) {
        String text = "  Нап,исать. Метод, бяка неоБХОдимыЙ,, БяКА для пои.сКа самОГО длиНн.ого сл,ова в ТекстE . ";
        System.out.println(text); // выводим неформатированный текст в строку

        longWord(text);
    }
    
    public static void longWord(String text) // метод принимает на вход массив
    {
        text = text.replace(",", ""); // убираем запятые
        text = text.replace(".", ""); // убираем запятые
        text = text.trim(); // убираем пробелы спереди и сзади
        text = text.toLowerCase(); // приводим к нижнему регистру
        String[] array = text.split(" "); // разбиение на слова по пробелу

        System.out.println(Arrays.toString(array)); // вывод массива в строку
        System.out.println("Массив содержит " + array.length + " элементов"); // определяем сколько элементов содержит массив

        String target = "бяка";
        boolean m = true;
        for (int i = 0; i < array.length; i++) {
            if (m = (target.equals(array[i]))) {
                m = true;
            }
            if (m) {
                System.out.println("Индекс нецензурного слова: " + i);
                System.out.println(array[i]);
            }
        }
    }
}

