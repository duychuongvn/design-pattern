package vn.chuonghd.journaldev.structuralpattern.adapter;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    public Volt get120Volt() {
        return socket.getVolt();
    }

    public Volt get12Volt() {
        return convertVolt(socket.getVolt(), 10);
    }

    public Volt get3Volt() {
        return convertVolt(socket.getVolt(), 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}