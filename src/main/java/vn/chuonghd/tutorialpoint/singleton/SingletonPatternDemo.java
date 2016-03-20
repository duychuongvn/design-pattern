package vn.chuonghd.tutorialpoint.singleton;

/**
 * Created by huynhduychuong on 3/19/2016.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }


}
