package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 증감 연산자
        int x = 0;

        x = 0 + 1;  // 1 증가
        System.out.println("x = " + x);
        x = x + 1;
        System.out.println("x = " + x);

        ++x;    // x = x + 1
        System.out.println("x = " + x);
        x++;    // x = x + 1
        System.out.println("x = " + x);
        --x;    // x = x - 1
        System.out.println("x = " + x);
        x--;    // x = x - 1
        System.out.println("x = " + x);

    }
}
