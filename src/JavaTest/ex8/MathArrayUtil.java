package JavaTest.ex8;

import static0.ex.MathUtility;

public class MathArrayUtil {
    private MathArrayUtil() {};

    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
    public static double average(int[] array) {
        return sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }return max;
    }
}
