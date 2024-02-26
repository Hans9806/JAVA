package polymorphism.ex.ex1_1;

public class HankookTire extends Tire{
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        return super.roll();
    }
}
