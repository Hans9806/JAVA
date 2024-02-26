package JavaTest;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구구단 단수를 입력하세요: ");
        int n = scanner.nextInt();


        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d \n",n,i,n*i);
        }
    }

}
