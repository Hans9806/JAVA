package generic.genric_interface;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        System.out.println("새 자동차를 대여합니다.");
        return new Car();
    }
}
