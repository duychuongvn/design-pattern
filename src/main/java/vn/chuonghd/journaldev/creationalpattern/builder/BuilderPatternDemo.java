package vn.chuonghd.journaldev.creationalpattern.builder;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

        System.out.println("Computer builder: " + computer);
    }
}
