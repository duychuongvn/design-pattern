package vn.chuonghd.tutorialpoint.singleton;

/**
 * Created by huynhduychuong on 3/19/2016.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world");
    }
}
