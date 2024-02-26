package JavaTest.ex7;

public class Ex7 {
    public static void main(String[] args) {
        GameCharacter admin1 = new GameCharacter("홍길동",55,180);
        GameCharacter admin2 = new GameCharacter("이순신",100,350);

        admin1.attack();
        admin2.takeDamage(30);

        admin2.attack();
        admin1.takeDamage(10);


    }
}
