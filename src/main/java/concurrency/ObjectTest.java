package concurrency;

public class ObjectTest {

    public static void main(String[] args) {

        ClassRunnable object6 = new ClassRunnable(6, 0);
        Thread thread1 = new Thread(object6);
        thread1.start();

        System.out.println(thread1.isAlive());
//        while(!thread1.isAlive()) {
            if (thread1.isAlive()) {
                try {
                    Thread.sleep(2000);
                    object6.stopThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        Thread object4 = new Thread(new ClassRunnable(4, 50));
        Thread object5 = new Thread(new ClassRunnable(5, 100));

    }
}
