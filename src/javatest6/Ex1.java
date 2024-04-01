package javatest6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
/*
문자열 리스트 정렬

    주어진 문자열 리스트를 문자열의 길이에 따라 오름차순으로 정렬하세요.
    정렬된 리스트의 각 요소를 출력합니다. Comparator와 Consumer를 사용하여 구현하세요.

    데이터
    ====
    List<String> languages = Arrays.asList("java", "python", "swift", "cpp","ai");

    출력예시
    ===
    ai
    cpp
    java
    swift
    python
* */
public class Ex1 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java","python", "swift","cpp","ai");

        languages.sort(Comparator.comparingInt(String::length));

        Consumer<String> printConsumer = System.out::println;
        languages.forEach(printConsumer);
    }
}
