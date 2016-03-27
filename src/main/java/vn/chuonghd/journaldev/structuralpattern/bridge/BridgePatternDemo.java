package vn.chuonghd.journaldev.structuralpattern.bridge;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
