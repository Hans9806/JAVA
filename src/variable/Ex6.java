package variable;

public class Ex6 {
    public static void main(String[] args) {
        // Q. 빈 칸을 채우고 타입이 어떻게 왜 변하는지 스스로에게 설명해주세요.
        // 프로모션 문제
        int num1 = 10;
        long num2 = 20L;
        double result = num1 + num2;   // long, float, double

        // 캐스팅 문제
        double num3 = 10.5;
        int result2 = (int) num3;

        // 프로모션과 캐스팅
        int num4 = 10;
        double num5 = 5.5;
        double result3 =  num4 + (int) num5;
    }
}
