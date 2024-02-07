package variable;

public class Var1 {
    public static void main(String[] args) {
        // 변수 선언
        int age;        // 정수를 저장할 수 있는 age 이름의 변수 선언
        double value;  // 실수를 저장할 수 있는 value라는 이름의 변수 선언

        int x, y, z;    // 같은 종류의 변수는 한꺼번에 선언 가능

        int score;      // 변수 선언 Declare : 타입 변수이름
//        int score = 80; // 변수 선언은 1번만 가능하다.
//        score = 80.5;   // 변수에는 타입이 맞는 값을 넣어야 한다.

        score = 90;     // 변수 초기화 initialize : 변수이름
        System.out.println("점수 : " + score);
        score = 100;    // 변수는 값이 변한다.
        System.out.println("점수 : " + score);

        int number = 100;  // 선언과 초기화 동시에 가능

        int result = score + number;   // 다른 변수의 값을 불러들여 저장, 또는 연산 가능

        System.out.println("결과" + result);


    }
}
