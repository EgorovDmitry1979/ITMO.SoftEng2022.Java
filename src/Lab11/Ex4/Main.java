package Lab11.Ex4;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());

        threadOne.start();
        threadTwo.start();
    }
}