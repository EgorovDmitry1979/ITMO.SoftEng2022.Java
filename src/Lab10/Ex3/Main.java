package Lab10.Ex3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Передаем адрес первого файла
        String adress1 = "C://ИНЖЕНЕР_ПРОГРАММИСТ//09_Программирование на Java//2. Практика//JAVA//files//FromTextFile.txt";
        // Передаем адрес второго файла
        String adress2 = "C://ИНЖЕНЕР_ПРОГРАММИСТ//09_Программирование на Java//2. Практика//JAVA//files//ToTextFile.txt";
        // Передаем конечного файла
        String adress3 = "C://ИНЖЕНЕР_ПРОГРАММИСТ//09_Программирование на Java//2. Практика//JAVA//files//FileFromTo.txt";


        // Запуск метода, который склеивает два текстовых файла в третий
        ConnTwoFiles_v2.connTwoFiles(adress1, adress2, adress3);
    }
}
