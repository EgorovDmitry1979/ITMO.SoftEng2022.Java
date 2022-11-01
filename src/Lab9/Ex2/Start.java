package Lab9.Ex2;

public class Start {
    public static void main(String[] args) throws InterruptedException {

        long start = System.nanoTime();
        AddMillion.addAL(); // логика ArrayList
        Thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;

        long start1 = System.nanoTime();
        AddMillion.addLL(); // логика LinkedList
        Thread.sleep(1000);
        long finish1 = System.nanoTime();
        long elapsed1 = finish1 - start1;

        System.out.println("Для ArrayList прошло времени, c: " + elapsed/1000000000.0);
        System.out.println("Для LinkedList прошло времени, c: " + elapsed1/1000000000.0);
    }
}

// Замер 1
// Для ArrayList прошло времени, c: 1.1885725
// Для LinkedList прошло времени, c: 114.7176379

// Замер 2
// Для ArrayList прошло времени, c: 1.1954169
// Для LinkedList прошло времени, c: 118.6209059

// Замер 3
// Для ArrayList прошло времени, c: 1.1995233
// Для LinkedList прошло времени, c: 114.6967703