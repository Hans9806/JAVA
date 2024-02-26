package polymorphism.ex.ex1_1;

public class Ex1 {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 0; i < 7; i++) {
            int problemLocation = car.run();

          /*  // 타이어 펑크 시 자동차 멈춤
            if (problemLocation > 0) {
                break;
            }*/

            // 자동차 펑크 시 타이어 교체
            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 한국타이어 교체");
                    car.forntLeftTire = new HankookTire("앞왼쪽",15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타이어 교체");
                    car.forntRightTire = new KumhoTire("앞오른쪽", 10);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타이어 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 15);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타이어 교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽", 11);
                    break;

            }
        }
    }
}
