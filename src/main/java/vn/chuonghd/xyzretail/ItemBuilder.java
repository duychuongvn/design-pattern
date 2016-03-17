package vn.chuonghd.xyzretail;

import java.util.Iterator;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public interface ItemBuilder {
    public void buildBasket(int itemType, String description, int qty, double unit_price)
            throws ItemException;

    public double calculateTotalTax() throws ItemException;

    public double calculateTotal() throws ItemException;

    public void printExtendedTaxedPrice() throws ItemException;

    public Iterator<Item> getIterator();
}
