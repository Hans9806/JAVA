package library.lang.ex;

public class Ex10_2 {
    public static void main(String[] args) {
        String data = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        String[] users = data.split(";");
        StringBuilder gmailUser = new StringBuilder();
        int maxAge = 0;
        String oldestUser = null;
        int countKim = 0;

        // 1. 전체 사용자 수
        System.out.println("전체 사용자 수 : " + users.length);

        // 2. 사용자 정보 출력
        for (String user : users) {
            String[] userInfo = user.split(",");
            String name = userInfo[0];
            String age = userInfo[1];
            String email = userInfo[2];
            System.out.println("이름 : " + name + ", 나이 : " + age + ", 이메일 : " + email );

            // 3. gmail 사용자
            if (email.endsWith("gmail.com")) {
                gmailUser.append("\n - " + name);
            }

            // 4. 나이가 많은 사용자
            int intAge = Integer.parseInt(age);

            if (intAge > maxAge) {
                maxAge = intAge;
                oldestUser = name;
            }

            // 5. 김씨 성 수 세기
            if(name.startsWith("김")) {
                countKim++;
            }
        }

        System.out.println("Gmail 사용자 : " + gmailUser);

        System.out.println("가장 나이가 많은 사용자 : " + oldestUser + ", "+ maxAge);

        System.out.println("김씨가 포함된 사용자 수 : " + countKim);
    }


}