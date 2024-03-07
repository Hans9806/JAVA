package library.lang.ex;

public class Ex11_2 {
    public static void main(String[] args) {
        String input = "데이터 분석과 프로그래밍은 매우 재미있어요";

        String[] words = input.split(" ");

        String longWord = "";
        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        System.out.println(longWord);
    }
}
