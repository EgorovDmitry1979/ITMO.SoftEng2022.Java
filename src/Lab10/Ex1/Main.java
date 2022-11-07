package Lab10.Ex1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String adress = "C://ИНЖЕНЕР_ПРОГРАММИСТ//09_Программирование на Java//2. Практика//JAVA//files//FromTextFile.txt";

         //      FromTextFile_old.readToScreen(adress);

        List<String> strings = FromTextFile_v2.readToScreen(adress); // лок. переменная списка
        for (String string : strings) //
        {

            System.out.println(string);

        }
    }
}
