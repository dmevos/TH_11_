import static java.lang.Thread.sleep;

public class MyThread extends Thread {
    MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
        start();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                sleep(2500);
                System.out.println("Я поток " + Thread.currentThread().getName() + ". Всем привет!");

            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
