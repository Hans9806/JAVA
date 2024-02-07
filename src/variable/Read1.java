package variable;

import java.io.IOException;
import java.util.Scanner;

public class Read1 {
    public static void main(String[] args) throws IOException {
        int read = System.in.read();// 시스템 입력장치에서 키를 읽어라
        // 읽은 결과는 KeyCode로 저장됨.
        System.out.println(read);

        // 키보드에 입력된 내용을 문자열로 얻기
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println(line);
    }
}
