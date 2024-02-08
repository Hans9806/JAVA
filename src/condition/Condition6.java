package condition;

public class Condition6 {
    public static void main(String[] args) {
        // 가격이 10000원 이상일 때, 1000원 할인
        // 나이가 10살 이하일 때 1000원 할인
        int price = 15000;
        int age = 9;
        int dc = 0;

        if (price >= 10000) {
            dc = dc + 1000;     // dc += 1000;
            System.out.println("만원 이상 구매로 1000원 할인 되었습니다.");
        }
        // else if를 사용하게 될 경우 각각의 할인을 적용하지 못한다.
        if (age <= 10) {
            dc = dc + 1000;
            System.out.println("10살 이하 고객으로 1000원 할인 되었습니다.");
        }
        System.out.println("모두 " + dc + "원 할인되었습니다.");

        // 각각의 조건이 독립 조건일때 if문을 개별적으로 사용
        // 모두 연관되는 조건일 때 else - if문을 사용한다.
    }
}
