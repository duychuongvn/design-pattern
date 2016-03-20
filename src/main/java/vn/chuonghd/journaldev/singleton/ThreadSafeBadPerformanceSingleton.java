package vn.chuonghd.journaldev.singleton;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class ThreadSafeBadPerformanceSingleton {

    private static ThreadSafeBadPerformanceSingleton instance;

    private ThreadSafeBadPerformanceSingleton() {
    }

    /**
     * implementation works fine and provides thread-safety but it reduces
     the performance because of cost associated with the synchronized method,
     although we need it only for the first few threads who might create the
     separate instances (Read: Java Synchronization).
     * @return
     */
    public synchronized static ThreadSafeBadPerformanceSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeBadPerformanceSingleton();
        }
        return instance;
    }

}
