package Lab10.Ex3;

import java.io.*;

public class ConnTwoFiles_v2 {
    // Метод, который склеивает два текстовый файла один
    public static void connTwoFiles(String adress1, String adress2, String adress3) throws IOException {

        File file1 = new File(adress1);

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String text1;
            while ((text1 = reader.readLine()) != null) {

                FileWriter writer = new FileWriter(String.valueOf(adress3), true);

                writer.write(text1);

                writer.append('\n'); // перенос строки
                writer.flush();
                writer.close();
            }
        }
        File file2 = new File(adress2);

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file2))) {
            String text2;
            while ((text2 = reader1.readLine()) != null) {

                FileWriter writer2 = new FileWriter(String.valueOf(adress3), true);

                writer2.write(text2);

                writer2.append('\n'); // перенос строки
                writer2.flush();
                writer2.close();

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}


