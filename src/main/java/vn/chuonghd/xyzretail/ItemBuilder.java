package vn.chuonghd.xyzretail;

import java.util.Iterator;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public interface ItemBuilder {
    void buildBasket(int itemType, String description, int qty, double unit_price)
            throws ItemException;

    double calculateTotalTax() throws ItemException;

    double calculateTotal() throws ItemException;

    void printExtendedTaxedPrice() throws ItemException;

    Iterator<Item> getIterator();
}
