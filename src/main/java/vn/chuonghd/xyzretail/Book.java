package vn.chuonghd.xyzretail;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public class Book extends Goods {
    private boolean isTaxed = false;
    private boolean isImported = false;

    public Book(String description, int qty, double price) {
        super(description, qty, price);
    }

    public boolean isTaxed() {
        return isTaxed;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean b) {
        isImported = b;
    }
}
