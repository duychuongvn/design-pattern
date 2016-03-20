package vn.chuonghd.journaldev.creationalpattern.factory;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class ComputerFactoryDemo {
    public static void main(String[] args) {
        System.out.println("Demo Factory Pattern");
        demoFactoryPattern();

        System.out.println();
        System.out.println("Demo Abstract Factory Pattern");
        demoAbstractFactoryPattern();
    }

    private static void demoFactoryPattern() {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.5 GH");
        Computer server = ComputerFactory.getComputer("server", "12 GB", "1500 GB", "3.5 GH");
        System.out.println("PC details: " + pc);
        System.out.println("Server details: " + server);
    }


    private static void demoAbstractFactoryPattern() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.5 GH"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("12 GB", "1500 GB", "3.5 GH"));
        System.out.println("PC details: " + pc);
        System.out.println("Server details: " + server);
    }
}
