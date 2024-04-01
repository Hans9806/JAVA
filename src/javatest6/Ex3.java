package javatest6;

import java.util.Arrays;
import java.util.List;
/*
숫자 점수 변환

스트림 API를 사용하여 주어진 정수 리스트에서 양수만 필터링한 후, 각 숫자의 제곱근을 구하여 결과를 출력하세요.

List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

출력 결과:
        4.0
        2.0
        1.0
        3.0
        5.0
        */
public class Ex3 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 0 ,25);

        scores.stream()
                .sorted()
                .filter(score -> score > 0)
                .map(Math ::sqrt)
                .forEach(System.out::println);
    }
}
