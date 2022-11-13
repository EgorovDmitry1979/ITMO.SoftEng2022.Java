package Lab11.Ex1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // создание и запуск только одного потока
//        Thread myRunnable = new Thread(new TenStreams());
//        myRunnable.start();

        // создание и запуск нескольтких потоков (10)
        for (int j = 0; j < 10; j++) {
            new Thread(new TenStreams()).start();
        }
    }
}
