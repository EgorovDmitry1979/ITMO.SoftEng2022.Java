package Lab10.Ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FromTextFile_v2 {
    // Метод, который читает текстовый файл и возвращает его в виде списка строк
    public static String readToScreen(String adress) {

        File file = new File(adress);

        String input = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println(" "); // пробел
            List<String> list = null;
            while ((input = reader.readLine()) != null) {

                list = new ArrayList<>(Collections.singleton(input));
                list.add(input);

 //               System.out.println(input);
                return list.toString();
            }

        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
        return input;
    }
}
