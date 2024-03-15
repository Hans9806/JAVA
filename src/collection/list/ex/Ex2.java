package collection.list.ex;

import java.util.ArrayList;
import java.util.List;

/*
  요소 제거

  문제: 문자열을 저장하는 ArrayList를 생성하고, 여러 개의 문자열을 추가하세요.
  그 후, 특정 조건(예: 길이가 5 이하인 문자열)을 만족하는 요소들을 모두 제거하세요.
  최종 리스트를 출력하는 프로그램을 작성하세요.

  > 예시 문자열
  "Hello", "World", "Java" "Programming"
  > 제거 후 리스트에 남은 요소
  "Java"
   */
public class Ex2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        // Java 9버전 이상인 경우 immutable List 를 만드는 of 메서드
        /*for (String name : names) {
            if (name.length() > 5) {
                System.out.println(name);
            }
        }*/

        /*System.out.println(strings);
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Programming");

        // 1. 역순으로 for문 접근
        for (int i = 0; i < strings.size(); i--) {
            strings.remove(i);
        }
        // 2. 제거할 때마다 인덱스 조정
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() <= 5) {
                strings.remove(i);
                i--;        // 요소를 제거할 때 인덱스를 조정
            }
        }*/


    }
}
