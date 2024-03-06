package library.lang.ex;

import java.util.Arrays;

/*
  실습 문제: 문자열 정보 처리 및 분석

  요구사항:
  당신은 텍스트 기반 데이터를 처리하는 소프트웨어를 개발하고 있습니다.
  사용자로부터 한 줄의 문자열을 입력받아,
  다음과 같은 정보를 출력하는 프로그램을 작성하세요.

  - 입력받은 문자열의 길이.
  - 문자열에서 공백의 수.
  - 문자열을 쉼표(,)로 분리한 후, 각 부분 문자열의 길이를 출력.
  - 문자열이 "Java"를 포함하는지 여부.
  - 문자열이 "프로그래밍"으로 끝나는지 여부.
  - 문자열 중 "a" 문자가 몇 번 나타나는지 카운트. (대소문자 구분 없음)

  입력 예시 문자열
  ===
  Java 프로그래밍, 문자열 처리 연습

  출력 예시
  ===
  문자열 길이: 24
  공백 수: 3
  각 부분 문자열 길이: [13, 8, 2]
  "Java" 포함 여부: true
  "프로그래밍"으로 끝나는가: false
  "a" 문자의 수: 2
   */
public class Ex9 {
    public static void main(String[] args) {
        String input = "Java 프로그래밍, 문자열 처리 연습";

        System.out.println("문자열 길이 : "+input.length());

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))){
                count++;
            }
        }
        System.out.println("공백의 수 : " + (count-1));

        String[] parts = input.split(", ");
        System.out.print("각 부분 문자열 길이: [");
        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i].length());
            if (i < parts.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // "Java" 포함 여부
        boolean containsJava = input.contains("Java");
        System.out.println("\"Java\" 포함 여부: " + containsJava);

        boolean endsWithPrograming = input.endsWith("프로그래밍");
        System.out.println("\"프로그래밍\" 으로 끝나는가: "+ endsWithPrograming);

        int countA = input.length() - input.replace("a", "").length();
        System.out.println("\"a\" 문자의 수: " + countA);
        }

    }
