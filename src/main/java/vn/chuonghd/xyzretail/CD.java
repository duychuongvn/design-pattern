package vn.chuonghd.xyzretail;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public class CD extends Goods {
    private boolean isTaxed = true;
    private boolean isImported = false;
    public CD(String description, int qty, double price) {
        super(description, qty, price);
    }

    @Override
    protected boolean isTaxed() {
        return this.isTaxed;
    }

    @Override
    protected boolean isImported() {
        return this.isImported;
    }
    public void accept(ItemVisitor itemVisitor) {
        itemVisitor.visit(this);
    }
    public void setImported(boolean isImported) {
        this.isImported = isImported;
    }
}
