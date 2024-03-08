package library.util.ex;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
    연습 문제 3: 회의 시간대 변환하기
    요구사항: 뉴욕에서 오후 3시에 시작하는 온라인 회의가 있다고 할 때,
     이 회의가 서울과 런던에서 몇 시에 시작하는지 계산하여 출력하세요.
    ZonedDateTime과 ZoneId를 사용하여 시간대 변환을 수행하세요.

    출력예시:
    회의는 뉴욕 기준 오후 3시에 시작합니다.
    서울에서는 회의가 오전 5시에 시작합니다.
    런던에서는 회의가 오후 8시에 시작합니다.

     */
public class Ex6 {
    public static void main(String[] args) {
        ZonedDateTime newYorkMeetingTime = ZonedDateTime.now(ZoneId.of("America/New_York"))
                .withHour(15).withMinute(0).withSecond(0);

        ZonedDateTime seoulMeetingTime = newYorkMeetingTime.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonMeetingTime = newYorkMeetingTime.withZoneSameInstant(ZoneId.of("Europe/London"));

        // 시간 형식 설정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("a h시 m분");

        System.out.println("회의는 뉴욕 기준 " + formatter.format(newYorkMeetingTime) + "에 시작합니다.");
        System.out.println("서울에서는 회의가 " + formatter.format(seoulMeetingTime) + "에 시작합니다.");
        System.out.println("런던에서는 회의가 " + formatter.format(londonMeetingTime) + "에 시작합니다.");
    }
}
