package vn.chuonghd.journaldev.structuralpattern.adapter;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        System.out.println("Using Class Adapter");
        testSocketClassAdapter();

        System.out.println();
        System.out.println("Using Object Adapter");
        testSocketObjectAdapter();
    }

    private static void testSocketObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt volt3 = socketAdapter.get3Volt();
        Volt volt12 = socketAdapter.get12Volt();
        Volt volt120 = socketAdapter.get120Volt();

        System.out.println("Volt 3 = " + volt3.getVolts());
        System.out.println("Volt 12 = " + volt12.getVolts());
        System.out.println("Volt 120 = " + volt120.getVolts());

    }

    private static void testSocketClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt volt3 = socketAdapter.get3Volt();
        Volt volt12 = socketAdapter.get12Volt();
        Volt volt120 = socketAdapter.get120Volt();

        System.out.println("Volt 3 = " + volt3.getVolts());
        System.out.println("Volt 12 = " + volt12.getVolts());
        System.out.println("Volt 120 = " + volt120.getVolts());
    }
}
