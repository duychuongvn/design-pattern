package vn.chuonghd.journaldev.creationalpattern.factory;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
