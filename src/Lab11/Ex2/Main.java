package Lab11.Ex2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // создание и запуск потока
        Thread myRunnable = new Thread(new StreamStatus());

//        myRunnable.start();
        Thread.State ts = myRunnable.getState();
        System.out.println("Состояние потока: " + ProcessState.State(ts));

        myRunnable.start();
    }
}

