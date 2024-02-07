package variable;

public class Var3 {
    public static void main(String[] args) {
        // 변수의 사용
        int hour = 3;
        int minute = 20;

        System.out.println(hour + "시간" + minute + "분");

        // 시간을 분으로 변환해 저장
        //int totalMinute = ______ ;
        int totalMinute = hour * 60 + minute;

        System.out.println("총 " + totalMinute + "분");
    }
}
