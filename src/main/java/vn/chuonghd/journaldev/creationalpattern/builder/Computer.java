package vn.chuonghd.journaldev.creationalpattern.builder;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class Computer {
    // required attributes
    private String HDD;
    private String RAM;

    // optional attributes

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.getHDD();
        this.RAM = computerBuilder.getRAM();
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled();
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled();
    }

    @Override
    public String toString() {
        return "RAM = " + this.getRAM() + ", HDD = " + this.getHDD() + ", isBluetoothEnabled = " + this.isBluetoothEnabled() + ", isBluetoothEnabled = " + this.isBluetoothEnabled();
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
}
