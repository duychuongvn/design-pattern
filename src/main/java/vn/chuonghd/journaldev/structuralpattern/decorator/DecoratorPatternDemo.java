package vn.chuonghd.journaldev.structuralpattern.decorator;

/**
 * ? Decorator pattern is helpful in providing runtime modification
 * abilities and hence more flexible. It’s easy to maintain and extend
 * when the number of choices are more.
 * 􀁸 The disadvantage of decorator pattern is that it uses a lot of similar
 * kind of objects (decorators).
 * Created by huynhduychuong on 3/27/2016.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();

        System.out.println("******");

        Car sportCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportCar.assemble();
    }
}
