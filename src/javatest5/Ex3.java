package javatest5;

import java.util.HashMap;
import java.util.Map;

/*
단어 빈도수 계산

한 문장 내에서 각 단어가 몇 번 나타나는지 계산하는 프로그램을 작성하세요.
대소문자는 구분하지 않으며, 단어는 공백으로 구분된다고 가정합니다.
결과는 단어를 키로 하고, 빈도수를 값으로 하는 HashMap에 저장해야 합니다.
     * 문자열 메서드 replaceAll 은 매개변수로 한글이 아닌 것을 찾는 정규식
       "[^가-힣]"을 매개변수로 받을 수 있습니다.

        입력 예시
    ===
String text = "나는 집에 간다. 나는 학교에 간다.";

출력 예시
    ===
단어 빈도수:
간다: 2
집에: 1
나는: 2
학교에: 1
*/
public class Ex3 {
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";
        Map<String, Integer> map =new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            word = word.replaceAll(  "[^가-힣]","");

            int fre = map.getOrDefault(word,0)+1;
            map.put(word,fre);
        }
        System.out.println("단어 빈도수: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }
}
