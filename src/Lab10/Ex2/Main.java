package Lab10.Ex2;

import Lab10.Ex1.FromTextFile_v2;

public class Main {
    public static void main(String[] args) {

        // Передаем адрес файла для заеписи данных
        String adress = "C://Users//Дмитрий//Desktop//09_Программирование на Java//2. Практика//JAVA//files//ToTextFile.txt";

        // Запуск метода, который записывает в файл строку, переданную параметром
        ToTextFile.toTextFile(adress);

        // Запуск метода, разработанного в лабораторной 10.1, для чтение нового содержимого файла
        FromTextFile_v2.readToScreen(adress);
    }
}




