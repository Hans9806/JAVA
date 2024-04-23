package jdbc.object;

import java.util.Objects;

// users 테이블에 대응하는 클래스
// VO : Value Object, 데이터를 전달하는 데 사용되는 객체
// 데이터 전달 역할만하고, 별도의 로직은 가지고 있지 않음
// 1. 불변성 : 설정 이후에는 값이 변하지 않음
// 2. 동등성 : 내용이 같으면 같은 인스턴스
// 3. 재사용성 : 같은 구조를 계속 공통적을 사용
public class User {
    // 필드는 테이블의 속성(컬럼)
    private String userId;
    private String userName;
    private String password;
    private int age;
    private String email;

    public User(String userId, String userName, String password, int age, String email) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public String getUserId() { return userId; }

    public String getUserName() { return userName; }

    public String getPassword() { return password; }

    public int getAge() { return age; }

    public String getEmail() { return email; }

    // 동등성을 위해 hashCode 와 equal 구현


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
