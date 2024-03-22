package javatest5;

import java.util.function.Function;

/*
날짜 변환기

요구사항:
주어진 날짜 문자열(예: "20240320")을 "2024-03-20" 형태로 변환합니다.
함수형 인터페이스 Function<String, String>과 문자열 substring을 사용하여 구현하세요.

출력예시
    ===
            2024-03-20
            */
public class Ex5 {
    public static void main(String[] args) {
        Function<String, String> tranceDate = date ->
                date.substring(0,4)+"-"+date.substring(4,6)+"-"+date.substring(6);

        String date = "20240320";
        System.out.println(tranceDate.apply(date));
    }
}
