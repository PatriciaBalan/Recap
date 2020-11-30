package concurrency;

public class ClassRunnable implements Runnable {

    private int value;
    private int id;

    private boolean isAlive;

    public ClassRunnable(int id, int value) {
        this.value = value;
        this.id = id;
    }

    public void increaseValue() {
         value = value + 1;
    }

    public void stopThread() {
        isAlive = false;
        System.out.println("Thread " + id + "with stop here");
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void run() {
        isAlive = true;
        int index = 0;
        while(isAlive) {
            increaseValue();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from thread " + id + " value " + value);
            index++;
        }
    }
}
