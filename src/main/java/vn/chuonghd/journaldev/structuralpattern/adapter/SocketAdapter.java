package vn.chuonghd.journaldev.structuralpattern.adapter;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public interface SocketAdapter {
    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}
