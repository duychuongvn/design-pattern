package vn.chuonghd.xyzretail;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public class GoodsLabellingVisitor implements ItemVisitor {
    public void visit(CD cd) {
        markWithCatalogNumber(cd);
    }


    public void visit(Cosmetics cosmetics) {
        markWithColorNumber(cosmetics);
    }

    public void visit(Book book) {
        markWithISBNNumber(book);
    }

    private void markWithColorNumber(Cosmetics cosmetics) {
        System.out.println("Color number for : " + cosmetics.getDescription());
    }

    private void markWithCatalogNumber(CD cd) {
        System.out.println("Catalog number for : " + cd.getDescription());
    }

    private void markWithISBNNumber(Book book) {
        System.out.println("ISBN number for : " + book.getDescription());
    }
}
