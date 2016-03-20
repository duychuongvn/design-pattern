package vn.chuonghd.journaldev.creationalpattern.factory;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        throw new IllegalArgumentException("Computer type " + type + " not supported");
    }
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
