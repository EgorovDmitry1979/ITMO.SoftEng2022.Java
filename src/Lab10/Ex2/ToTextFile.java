package Lab10.Ex2;

import java.io.FileWriter;
import java.io.IOException;

public class ToTextFile {

    public static void toTextFile(String adress) {

        try (FileWriter writer = new FileWriter(String.valueOf(adress), true)) {
            // запись всей строки
            String text = "\nЗапись в файл данных,\nкоторые передаем через\nпараметр в скобках метода";
            writer.write(text);
            // запись по символам
            writer.append('\n'); // перенос строки

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

