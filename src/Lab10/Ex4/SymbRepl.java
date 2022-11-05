package Lab10.Ex4;

import java.io.*;

public class SymbRepl {

    public static void connTwoFiles(String adress1, String adress2) throws IOException {

        File file = new File(adress1);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String text;
            while ((text = reader.readLine()) != null) {

                FileWriter writer = new FileWriter(String.valueOf(adress2), true);

                // замена знаков препинания на переменную, а затем на знак
                text = text.replaceAll("\\p{Punct}", "num1");
                text = text.replace("num1", "$");

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


