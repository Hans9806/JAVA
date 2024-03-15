package javatest4;
/*
가장 긴 단어 찾기

요구사항:
사용자로부터 한글 문장을 입력받아,
문장 내에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
단어는 공백으로 구분됩니다.

        예시 입력
    ===
데이터 분석과 프로그래밍은 매우 재미있어요

예시 출력
    ===
프로그래밍은
*/
public class Ex5 {
    public static String findLongestWord(String input) {
        String[] words = input.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String input = "데이터 분석과 프로그래밍은 매우 재미있어요";
        String longestWord = findLongestWord(input);
        System.out.println("가장 긴 단어는: "+longestWord);
    }
}
