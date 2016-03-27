package vn.chuonghd.journaldev.structuralpattern.bridge;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
