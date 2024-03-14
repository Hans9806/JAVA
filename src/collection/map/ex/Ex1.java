package collection.map.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
  연습문제 1: 학생 점수 관리

  문제 설명
  학생들의 이름과 그에 해당하는 점수를 HashMap을 사용하여 관리하는 프로그램을 작성하세요.
   프로그램은 다음 기능을 수행해야 합니다:

  학생의 이름과 점수를 추가합니다.
  특정 학생의 점수를 조회합니다.
  모든 학생의 이름과 점수를 출력합니다.

  예시 데이터
  학생 "Alice"의 점수는 85점입니다.
  학생 "Bob"의 점수는 92점입니다.
  학생 "Charlie"의 점수는 88점입니다.
   */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Map<String,Integer> student = new HashMap<>();

        student.put("Alice", 85);
        student.put("Bob", 92);
        student.put("Charlie", 88);

        student.forEach( (key, value) ->
                System.out.println("학생" + key + "의 점수는 "+ value + "점입니다"));

        System.out.println("조회하고 싶은 학생의 이름을 입력하세요: ");
        String studentName = scanner.nextLine();
        if (student.containsKey(studentName)) {
            System.out.println("학생" + studentName +"의 점수는 "+student.get(studentName)+"점입니다.");
        } else {
            System.out.println(studentName+ "의 정보가 없습니다.");
        }
    }

}
