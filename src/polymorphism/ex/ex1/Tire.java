package polymorphism.ex.ex1;

public class Tire {
    protected int maxRotation;
    protected int accumulatedRotation;
    protected String location;

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location+"Tire 수명: "+(maxRotation - accumulatedRotation) + " 회");
            return true;
        }else {
            System.out.println(location + "타이어 펑크");
            return false;
        }
    }
}
