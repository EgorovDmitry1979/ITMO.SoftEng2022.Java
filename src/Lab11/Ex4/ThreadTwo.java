package Lab11.Ex4;

public class ThreadTwo implements Runnable {

    @Override
    public void run() {
        synchronized (Sync.sync) {

            int i = 0;
            while (i < 1) {

                try {
                    System.out.println("Thread_Two");
                    Sync.sync.notify();
                    Sync.sync.wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
