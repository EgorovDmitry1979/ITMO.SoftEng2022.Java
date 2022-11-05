package Lab10.Ex3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Передаем адрес файла источника данных
        String adress1 = "C://Users//Дмитрий//Desktop//09_Программирование на Java//2. Практика//JAVA//files//FromTextFile.txt";
        // Передаем адрес файла приемника данных
        String adress2 = "C://Users//Дмитрий//Desktop//09_Программирование на Java//2. Практика//JAVA//files//ToTextFile.txt";

        // Запуск метода, который склеивает два текстовых файла один
        ConnTwoFiles.connTwoFiles(adress1, adress2);
    }
}
