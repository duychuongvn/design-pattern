package vn.chuonghd.xyzretail;

/**
 * Created by huynhduychuong on 3/17/2016.
 */
public interface ItemVisitor {
    void visit(CD cd);
    void visit(Cosmetics cosmetics);
    void visit(Book book);
}
