package Lab5.Ex4;

// у.3.	Написать метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

public class SubstringToString {
    public static void main(String[] args) {

        System.out.println("Исходный текст:");
        String baseString = "Напишите метод, бяка заменяющий бяка тексте все вхождения слова на [вырезано цензурой]";
        System.out.println(baseString); // выводим неформатированный текст в строку
        System.out.println(" "); // пробел
        String subString = "бяка";

        sts(baseString, subString);
    }

    public static void sts(String baseString, String subString) // метод принимает на вход 2 строки
    {
        int n = 0; // исходное количество взождений подстроки в строку
        String[] array = baseString.split(" "); // разбиение на слова по пробелу
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(subString)) {
                n = n + 1;
            }
        }
        System.out.println("количество вхождений подстроки " + subString + " в строку - " + n);
    }
}




