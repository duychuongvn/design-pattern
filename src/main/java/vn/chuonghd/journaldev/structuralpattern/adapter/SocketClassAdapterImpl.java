package vn.chuonghd.journaldev.structuralpattern.adapter;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {


    public Volt get120Volt() {
        return getVolt();
    }

    public Volt get12Volt() {
        return convertVolt(getVolt(), 10);
    }

    public Volt get3Volt() {
        return convertVolt(getVolt(), 40);

    }

    private Volt convertVolt(Volt volt, int volts) {
        return new Volt(volt.getVolts() / volts);
    }
}
