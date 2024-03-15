package collection.list.ex.ex4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        List<String> candidates = new ArrayList<>();
        List<Integer> votes = new ArrayList<>();

        // 후보 목록 등록(초기화)
        candidates.add("고길동");
        candidates.add("둘리");
        candidates.add("마이콜");
        candidates.add("희동이");

        // 투표 받은 수 초기화
        for (int i = 0; i < candidates.size(); i++) {
            votes.add(0);
        }

        // 후보목록 출력하기
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(i+1 +". "+candidates.get(i));
        }

        // 투표 받기
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("투표하고 싶은 번호를 입력하세요. (종료는 0번 입니다.) ");
            int choice = scanner.nextInt();

            // 0이면 투표 종료하기
            if (choice == 0) break;
            else {
                // 투표 카운터 하기
                Integer vote = votes.get(choice - 1);   // 투표 수 가져오기(인덱스 주의)
                votes.set(choice - 1, vote + 1);
            }
        }
        // 반복문 빠져나올 시 투표결과 출력
        System.out.print("[투표결과] ");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.printf("%s : %d   ", candidates.get(i), votes.get(i));
        }

    }
}
