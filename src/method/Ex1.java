package method;

public class Ex1 {
    public static void main(String[] args) {
        // 두 수를 입력받아 뺼셈을 하는 메서드를 만들어주세요.
        int num = sub(10, 5);   // 메서드를 호출하면 리턴값을 반홚나다.
        System.out.println(num);     // 별도로 출력문 수행
        System.out.println(sub(10, 5));
    }

    public static int sub(int a, int b) {
        return a - b;   // 변수에 담을 필요가 없을 경우 inline으로 리턴
    }
}
