package Lab11.Ex2;

// Выведете состояние потока перед его запуском, после запуска и во время выполнения

public class StreamStatus implements Runnable {

    Thread.State ts = StreamStatus.getState();

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " число " + i);

            try {
                Thread.sleep(10);
                System.out.println("Состояние потока: " + ProcessState.State(ts));

            } catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        System.out.println(" "); // пробел
        System.out.println("Состояние потока: " + ProcessState.State(ts));
    }

    static Thread.State getState() {
        return null;
    }

    public void start() {
    }
}
