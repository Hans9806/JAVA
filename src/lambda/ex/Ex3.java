package lambda.ex;

import java.util.function.Function;

/*
   문제 :  나이 계산기
   요구사항: 사용자의 생년월일(예: "19900315")을 입력받아 현재 나이를 계산합니다.
   현재 년도는 2024년으로 가정합니다. Function<String, Integer>을 사용하여 나이를 계산하고 출력하세요.

   입력 데이터
   "19900315"

   출력 예시:
   34
    */
public class Ex3 {
    public static void main(String[] args) {
        Function<String, Integer> age = birthday -> 2024 - Integer.parseInt(birthday.substring(0,4));

        String age1 = "1998  0315";
        System.out.println(age.apply(age1));
    }

}
