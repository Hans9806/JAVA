package nested;

public class Main {
    public static void main(String[] args) {
        // var 키워드 : Java 10부터 도입 지역 변수의 타입 추론 가능
        // 가독성 향상을 위해 도입되었음
        // OuterClass 인스턴스 생성 없이도 바로
        // . 접근을 통해 클래스를 생성할 수 있음

        // static 중첩클래스 : DuterCLass
        var nested = new OuterClass.NestedStaticClass();
        nested.printMessage();

        OuterClass outerInstance = new OuterClass();
        var instanceInnerClass = outerInstance.new InstanceInnerClass();

        instanceInnerClass.printMessage();
    }
}
