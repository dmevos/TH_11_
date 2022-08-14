import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Main {
    final static int COUNT_TP = 4;

    public static void main(String[] args) {

        final ThreadGroup group = new ThreadGroup("GroupThreads");
        List<MyThread> myThreads = new ArrayList<>();

        for (int i = 0; i < COUNT_TP; i++) {
            myThreads.add(new MyThread(group, Integer.toString(i + 1)));
        }

        try {
            sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Завершаю все %d потока.\n", group.activeCount());
        group.interrupt();
    }
}