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
    public static List <String> readToScreen(String adress) {

        File file = new File(adress);
        List<String> list = new ArrayList<>();

        String input = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            while ((input = reader.readLine()) != null) {
                list.add(input);
            }

        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }


        return list;
    }
}
