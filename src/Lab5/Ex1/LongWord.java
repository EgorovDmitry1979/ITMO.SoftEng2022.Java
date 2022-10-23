package Lab5.Ex1;

import java.util.Arrays;

public class LongWord {
    public static void main(String[] args) {

        String java = "Java Developer";
        String s2 = new String("Java");

//        System.out.println(s==s2); // ссылочный тип данных ссылается на разные объекты
//        System.out.println(s.equals(s2)); // нужно использлвать equals
//        System.out.println(s.equalsIgnoreCase(s2));

//        s = s.concat("Developer"); // модификация строки но ее нужно перезаписать
//        String concat = s.concat("Developer"); // либо положить в ЛП чтобы не менять

//        System.out.println(s);
//        System.out.println(concat);
        int length = java.length(); // возвращает длину строки (положили в ЛП)
        boolean empty = java.isEmpty(); // возвращает явл строка пустой или нет. Не путать с NULL!
        System.out.println(java.substring(3)); // возвр. подстроку
        System.out.println(java.substring(2, 7));

        String hello = " Hello world! ";
        System.out.println(hello);
        System.out.println(hello.trim());

        System.out.println(hello.indexOf("w")); // возвращает индекс буквы

        System.out.println(hello.replaceAll("l", "!")); // меняет чтото на

        String[] strings = hello.split(" "); // разбивает строку по симфолу, например, по пробелу
        System.out.println(Arrays.toString(strings));

        for (String string : strings) {
            System.out.println(string);

            Integer integer = 123123;
            String number = String.valueOf(integer);
            System.out.println(number);
        }
    }
 //       longWord(String);

    public static void longWord(String[] args) {

    }
}
