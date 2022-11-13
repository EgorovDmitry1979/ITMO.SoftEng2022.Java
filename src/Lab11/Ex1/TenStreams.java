package Lab11.Ex1;

// Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100

public class TenStreams implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " число " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    public void start() {
    }
}
