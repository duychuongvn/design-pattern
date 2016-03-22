package vn.chuonghd.journaldev.structuralpattern.adapter;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
