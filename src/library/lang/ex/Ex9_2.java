package library.lang.ex;

public class Ex9_2 {
    public static void main(String[] args) {
        String input = "Java 프로그래밍, 문자열 처리 연습";

        // 1.
        System.out.println("문자열 길이 : " + input.length());

        // 2.
        int whiteSpaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                whiteSpaceCount++;
            }
        }

        System.out.println("공백 수 : " + whiteSpaceCount);

        // 3. 부분 문자열 길이
        System.out.print("부분 문자열의 길이 : [");
        String[] split = input.split(",");

        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i].trim().length());
            if (i != split.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 4. "Java" 포함 여부: true
        System.out.println("\"Java\" 포함 여부: " + input.contains("Java"));
        // 5. "프로그래밍"으로 끝나는가: false
        System.out.println("\"프로그래밍\"으로 끝나는가: " + input.endsWith("프로그래밍"));
        // 6. "a" 문자의 수: 2
        // a문자의 수 : 전체 길이의 수 - a를 제외한 수
        // 대문자A와 소문자a 모두 세어야 할 경우
        int countA = input.toLowerCase().length() - input.toLowerCase().replace("a", "").length();
        System.out.println("\"a\" 문자의 수: " + countA);

    }
}
