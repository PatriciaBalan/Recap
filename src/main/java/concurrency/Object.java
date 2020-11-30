package concurrency;

public class Object extends Thread {

    private int value;

    public Object(int value) {
        this.value = value;
    }

    private int count() {
        return value + 1;

    }

    @Override
    public void run() {
        System.out.println("Object is running " + value);
        if(value < 10) {
            System.out.println("First thread " + Thread.currentThread().getName() + " execution");
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(count());
    }
}
