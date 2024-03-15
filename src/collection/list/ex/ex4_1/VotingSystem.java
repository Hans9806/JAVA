package collection.list.ex.ex4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    List<Candidata> candidataList = new ArrayList<>();

    public VotingSystem() {
        this.candidataList = new ArrayList<>();
        this.candidataList.add(new Candidata("고길동"));
        this.candidataList.add(new Candidata("둘리"));
        this.candidataList.add(new Candidata("마이콜"));
        this.candidataList.add(new Candidata("희동이"));
    }
    public void startVoting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                    1. 고길동
                    2. 둘리
                    3. 마이콜
                    4. 희동이
                    """);
        while (true) {
            System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0번을 입력) : ");
            int vote = scanner.nextInt();
            if (vote > 0 && vote <= candidataList.size()) {
                candidataList.get(vote - 1).receiveVote();
            } else if (vote == 0) {
                break;
            } else {
                System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요");
            }
        }
        scanner.close();
    }
    public void printResults() {
        System.out.println("투표 결과 : ");
        for (Candidata candidata : candidataList) {
            System.out.println(candidata);
        }
    }

}
