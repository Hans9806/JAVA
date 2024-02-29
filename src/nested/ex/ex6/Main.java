package nested.ex.ex6;

public class Main {
    public static void main(String[] args) {
        /*다음 메인 메소드의 실행결과를 출력하는 Vehicle 클래스와 Anonymous
        클래스를 익명 인터페이스 구현 객체를 이용하여 만들어주세요.*/
        Anonymous anonymous = new Anonymous();
        anonymous.filed.run();
        anonymous.method1();
        anonymous.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });
    }
}
