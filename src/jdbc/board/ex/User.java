package jdbc.board.ex;

class User {
    String userId;
    String name;
    String password;
    int age;
    String email;

    public User(String userId, String name, String password, int age, String email) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
