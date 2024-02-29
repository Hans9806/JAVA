package nested.ex.ex5;

public class Main {
    /*다음 메인 메소드의 실행결과를 출력하는 Worker 클래스와
    Anonymous 클래스를 익명 자식 객체를 이용하여 만들어주세요.
    */
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        anonymous.field.start();
        anonymous.method1();
        anonymous.method2(new Worker() {
            @Override
            public void start() {
                System.out.println("테스트를 합니다.");
            }
        });
    }
}
