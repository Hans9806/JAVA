package library.lang.ex;

import java.util.Scanner;

public class Ex12_2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("주민등록번호 : ");
            String residentNumber = scanner.nextLine();

            String year = residentNumber.substring(0, 2);
            String month = residentNumber.substring(2, 4);
            String day = residentNumber.substring(4, 6);

            char genderNumber = residentNumber.charAt(7);
            String gender = genderNumber == '1' || genderNumber == '3' ? "남성" : "여성";

            if (genderNumber == '1' || genderNumber == '2') {
                year = "19" + year;
            } else if (genderNumber == '3' || genderNumber == '4') {
                year = "20" + year;
            }

            System.out.printf("생년월일 : %s년 %s월 %s일\n", year, month, day);
            System.out.println("성별 : " + gender );
        }
}
