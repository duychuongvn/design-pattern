package vn.chuonghd.journaldev.structuralpattern.bridge;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class Pentagon extends Shape {
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {

        System.out.print("Pentagon filled with color: ");
        color.applyColor();
    }
}
