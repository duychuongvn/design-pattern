package vn.chuonghd.xyzretail;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public abstract class Goods implements Item {
    private int qty;
    private double price;
    private String description;
    private Tax tax = new Tax();

    public Goods(String description, int qty, double price) {
        this.description = description;
        this.qty = qty;
        this.price = price;
    }

    protected abstract boolean isTaxed();

    protected abstract boolean isImported();

    public double getExtendedTax() {
        tax.calculate(isTaxed(), isImported(), price);
        return this.tax.getTotalUnitTax() * qty;
    }

    public double getExtendedTaxPrice() throws ItemException {
        return qty * (this.tax.getTotalUnitTax() + price);
    }

    //getters and setters go here for attributes like description etc
    public String getDescription() {
        return description;
    }

    public String toString() {
        return qty + " " + description + " : ";
    }
}
