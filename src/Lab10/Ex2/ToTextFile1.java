package Lab10.Ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Метод, записывающий в файл строку, переданную параметром.
public class ToTextFile1 {
    public static void toTextFile(String adress) throws IOException {

        File file = new File(adress);

        // Создание объекта FileWriter
        // false - перезаписываем файл, true - дописываем в конец
        FileWriter writer = new FileWriter(file, true);

        // Переменная, передающая текстовый параметр в скобки метода
        String text = "\nЗапись в файл данных,\nкоторые передаем через\nпараметр в скобках метода";

        // Запись содержимого в файл через параметр
        writer.write(text);
        writer.append('\n'); // перенос строки
        writer.close();
    }
}
