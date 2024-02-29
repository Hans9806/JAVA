package nested.ex.ex6;

public class Anonymous {
    Vehicle filed  = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자동차가 달립니다");
        }
    };
    void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        localVar.run();
    }
    void method2(Vehicle vehicle) {
        vehicle.run();
    }
}
