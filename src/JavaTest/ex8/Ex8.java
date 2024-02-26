package JavaTest.ex8;

import static JavaTest.ex8.MathArrayUtil.*;

public class Ex8 {
    public static void main(String[] args) {
        int[] values = {1, 2, 5, 7, 20, 30, 50, 65};
        System.out.println("sum = "+sum(values));
        System.out.println("sum = "+average(values));
        System.out.println("sum = "+min(values));
        System.out.println("sum = "+max(values));
    }
}
