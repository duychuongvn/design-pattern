package vn.chuonghd.journaldev.creationalpattern.builder;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class ComputerBuilder {
    // required parameters
    private String HDD;
    private String RAM;
    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // required arguments
    public ComputerBuilder(String HDD, String RAM) {
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    public Computer build() {
        return new Computer((this));
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
