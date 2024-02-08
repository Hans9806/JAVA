package variable;

public class Ex5 {
    public static void main(String[] args) {
        /* 아래와 같이 출력되도록 코드를 작성해주세요.
        이름 : 홍길동
        나이 : 25
        전화 : 010-1234-5678
         */
        String name = "홍길동";
        int age = 25;
        String tel1="010", tel2="1234", tel3="4567";

        System.out.println("이름 : " + name);
        System.out.print("나이 : " + age + "\n");
        System.out.printf("전화 : %s-%s-%s", tel1, tel2, tel3);

    }
}

