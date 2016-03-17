package vn.chuonghd.xyzretail;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public abstract class ItemFactory {
    public abstract Item getItem(int itemType, String description, int qty, double price)
            throws ItemException;
}
