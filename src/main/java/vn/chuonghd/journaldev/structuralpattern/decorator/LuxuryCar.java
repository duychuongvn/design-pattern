package vn.chuonghd.journaldev.structuralpattern.decorator;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }
}
