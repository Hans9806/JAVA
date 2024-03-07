package library.lang.ex;

import java.util.Scanner;

/*
  연습문제: 주민등록번호로 생년월일과 성별 구별하기

  요구사항:
  사용자로부터 주민등록번호를 입력받습니다.
  입력 형식은 "YYMMDD-XXXXXXX"입니다.
  주민등록번호를 분석하여 생년월일과 성별을 출력하는 프로그램을 작성하세요.

  성별 구별 번호는 주민등록번호의 뒷자리 첫 번째 숫자로,
  홀수이면 "남성", 짝수이면 "여성"으로 구별합니다.
  생년월일 출력 시, 1900년 또는 2000년대 출생자 구분을 위해
  성별 구별 번호가 1, 2이면 1900년대,
  3, 4이면 2000년대 출생으로 가정합니다.

  입력:
  ====
  주민등록번호: 991231-1234567
  주민등록번호: 010203-4321765

  실행 결과 예시:
  =====
  생년월일: 1999년 12월 31일
  성별: 남성
  생년월일: 2001년 02월 03일
  성별: 여성
   */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요 : ");
        String id = scanner.nextLine();
        String birthYear = id.substring(0,2);
        String birthMonth = id.substring(2,4);
        String birthDay = id.substring(4,6);

        char gender = id.charAt(7);

        if(gender == '1' || gender == '2') {
            birthYear = "19" + birthYear;
        } else if (gender == '3' || gender == '4') {
            birthYear = "20" + birthYear;
        }

        String genderStr = (gender % 2 == 0) ? "여성" : "남성";

        System.out.println("생년월일: "+birthYear+"년 "+birthMonth+"월 "+birthDay+"일");
        System.out.println("성별: "+genderStr);
    }
}