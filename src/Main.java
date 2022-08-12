import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {

        final ThreadGroup group = new ThreadGroup("GroupThreads");
        MyThread myThread1 = new MyThread(group, "1");
        MyThread myThread2 = new MyThread(group, "2");
        MyThread myThread3 = new MyThread(group, "3");
        MyThread myThread4 = new MyThread(group, "4");

        try {
            sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Завершаю все %d потока.\n", group.activeCount());
        group.interrupt();
    }
}