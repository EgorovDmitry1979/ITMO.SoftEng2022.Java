package Lab10.Ex2;

import Lab10.Ex1.FromTextFile;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Передаем адрес файла для заеписи данных
        String adress = "C://Users//Дмитрий//Desktop//09_Программирование на Java//2. Практика//JAVA//files//ToTextFile.txt";

        // Запуск метода, который записывает в файл строку, переданную параметром
        // 2 почти одинаковых метода.
        ToTextFile1.toTextFile(adress);
        ToTextFile2.toTextFile(adress);

        // Запуск метода, разработанного в лабораторной 10.1, для чтение нового содержимого файла
        FromTextFile.readToScreen(adress);
    }
}




