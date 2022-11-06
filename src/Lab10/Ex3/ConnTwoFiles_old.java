package Lab10.Ex3;

import java.io.*;

public class ConnTwoFiles_old {
    // Метод, который склеивает два текстовый файла один
    public static void connTwoFiles(String adress1, String adress2) throws IOException {

        File file = new File(adress1);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String text;
            while ((text = reader.readLine()) != null) {

                FileWriter writer = new FileWriter(String.valueOf(adress2), true);

                writer.write(text);

                writer.append('\n'); // перенос строки
                writer.flush();
                writer.close();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}


