package vn.chuonghd.xyzretail;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public interface Item {
    int TYPE_BOOK = 1;
    int TYPE_CD = 2;
    int TYPE_COSMETICS = 3;
    int TYPE_CD_IMPORTED = 4;

    double getExtendedTax();

    double getExtendedTaxPrice() throws ItemException;

    void setImported(boolean b);

    String getDescription();
    void accept(ItemVisitor itemVisitor);

}
