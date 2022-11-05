package Lab10.Ex4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Не получилось заменить знаки препинания в одном файле - пытался методом "чтение-замена-запись",
        // но ухошел в бесконечный цикл. Тогда сделал через 2 файла - исходный и конечный.

        // Адрес исходного файла со знаками препинания
        String adress1 = "C://Users//Дмитрий//Desktop//09_Программирование на Java//2. Практика//JAVA//files//FileOld.txt";
        // Адрес конечного файла со знаком '$' вместо знаков препинания
        String adress2 = "C://Users//Дмитрий//Desktop//09_Программирование на Java//2. Практика//JAVA//files//FileNew.txt";

        SymbRepl.connTwoFiles(adress1, adress2); // Вызов метода, заменяющего в файле все кроме букв и цифр на знак ‘$’
    }
}
