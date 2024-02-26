package polymorphism.ex.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Train train = new Train();

        car.move();
        bicycle.move();
        train.move();
    }
}
