package polymorphism.ex.ex1_1;

public class KumhoTire extends Tire {
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        return super.roll();
    }
}
