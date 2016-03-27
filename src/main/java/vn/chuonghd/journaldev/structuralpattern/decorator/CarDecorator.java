package vn.chuonghd.journaldev.structuralpattern.decorator;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void assemble() {

        this.car.assemble();
    }
}
