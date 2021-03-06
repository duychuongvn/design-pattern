package vn.chuonghd.xyzretail;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public class Cosmetics extends Goods {

    private boolean isTaxed = true;
    private boolean isImported = false;

    public Cosmetics(String description, int qty, double price) {
        super(description, qty, price);
    }

    public boolean isTaxed() {
        return isTaxed;
    }

    public boolean isImported() {
        return isImported;
    }

    public void accept(ItemVisitor itemVisitor) {
        itemVisitor.visit(this);
    }

    public void setImported(boolean b) {
        isImported = b;
    }

}
