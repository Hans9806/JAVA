package library.util.ex;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/*

  연습 문제 1: 다가오는 생일까지 남은 날짜 계산하기
  요구사항:
  사용자로부터 생년월일을 입력받아, 올해의 생일이 지났는지 여부에 따라
   올해 또는 내년 생일까지 남은 날짜를 계산하여 출력하세요.
   사용자의 생년월일과 현재 날짜에 LocalDate를 사용하고,
   남은 날짜 계산에는 Period 클래스를 활용하세요.

  입력 예시:
  1990-05-24

  출력 예시 (올해 생일이 지났을 경우):
  다음 생일까지 240일 남았습니다!

  출력 예시 (올해 생일이 아직 안 지났을 경우):
  다음 생일까지 30일 남았습니다!
   */
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("생년월일을 입력하세요 (예: 1990-05-24) : ");
        String birthDayInput = scanner.nextLine();
        LocalDate birthDay = LocalDate.parse(birthDayInput);

        LocalDate today = LocalDate.now();
        LocalDate nextBirthDay = birthDay.withYear(today.getYear());

        if (nextBirthDay.isBefore(today) || (nextBirthDay.isEqual(today))) {
            nextBirthDay = nextBirthDay.plusYears(1);
        }

        Period period = Period.between(today, nextBirthDay);
        int days = period.getDays() + period.getMonths()*30 + period.getYears()*365;
        System.out.println("다음생일까지 "+days+"일 남았습니다");
    }
}
