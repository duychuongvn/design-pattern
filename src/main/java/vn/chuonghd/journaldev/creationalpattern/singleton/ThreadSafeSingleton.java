package vn.chuonghd.journaldev.creationalpattern.singleton;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }


    /**
     * To avoid ThreadSafeBadPerformanceSingleton issue, double checked locking principle is used. In this
     * approach, the synchronized block is used inside if condition with an
     * additional check to ensure that only one instance of singleton class is
     * created.
     *
     * @return
     */
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
