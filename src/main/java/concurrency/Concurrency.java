package concurrency;


public class Concurrency implements Runnable {

    private int value;

    public Concurrency(int value) {
        this.value = value;
    }

    private void modifConc() {
        value = value + 1;
    }

    @Override
    public void run() {
        System.out.println("hello");
        System.out.println("Concurency is running " + value);
        boolean stopped = false;
        while (!stopped && (value > 0 && value < 10)) {
            System.out.println("First thread " + Thread.currentThread().getName() + " execution");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                stopped = true;
                e.printStackTrace();
            }
           modifConc();
        }
    }
}
