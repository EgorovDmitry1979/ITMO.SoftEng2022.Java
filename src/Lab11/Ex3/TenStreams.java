package Lab11.Ex3;

// Напишите программу, в которой запускается 100 потоков, каждый из которых
//вызывает метод increment() 1000 раз.
//После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .

public class TenStreams implements Runnable {

    @Override
    public void run() {
        boolean m = false;
        for (int i = 0; i < 1000; i++) {
            m = true;
            Counter.increment();
            System.out.println(Thread.currentThread().getName() + " число " + Counter.count);

            try // этот блок можно вообще выкинуть, но я его оставил
            {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        if (m) {
            int j = Counter.count;
            j = j + Counter.count / Counter.count - 1;

            System.out.println(""); // пробел
            System.out.println("Результат - " + j);

        } else System.out.println("Неведомая ошибка");
    }

    public void start() {
    }
}
