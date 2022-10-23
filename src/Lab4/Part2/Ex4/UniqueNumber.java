package Lab4.Part2.Ex4;
import java.util.Arrays;

// Часть 2. у.4. Дан массив чисел. Найти первое уникальное в этом массиве число
public class UniqueNumber {
    public static void main(String[] args) {

        int[] array = new int[6]; // создание массива
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 1;
        array[4] = 2;
        array[5] = 4;

        System.out.println("Исходный массив: " + Arrays.toString(array));
        FindNumber(array); // вызов метода для нахождения уникального числа
    }

    public static void FindNumber(int[] array) // метод принимает на вход массив
    {
        for (int i = 0; i < array.length; i++)
        {
            boolean m = true;
            for (int j = 0; j < array.length; j++)
            {
                if (array[i] == array[j] && i != j) // условие
                {
                    m = false;
                    break;
                }
            }
            if (m)
                System.out.print("Уникальное число: " + array[i]);
        }
    }
}
