package Lab10.Ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FromTextFile_old {
    // Метод, который читает текстовый файл и возвращает его в виде списка строк
    public static void readToScreen(String adress) {

        File file = new File(adress);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            System.out.println(" "); // пробел
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
    }
}