package concurrency;

public class ConcurrencyTest {

    public static void main(String[] args) {

        Thread concurrency = new Thread(new Concurrency(5));
        Thread concurrency1 = new Thread(new Concurrency(8));

        concurrency1.setPriority(10);
        concurrency.start();
        concurrency1.start();

    }
}
