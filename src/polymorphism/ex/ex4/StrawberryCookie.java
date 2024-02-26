package polymorphism.ex.ex4;

public class StrawberryCookie extends Cookie{
    @Override
    void run() {
        System.out.println("스트로베리 쿠키가 달립니다!");
    }

    @Override
    void jump() {
        System.out.println("스트로베리 쿠키가 높이 점프합니다!");
    }

    @Override
    void specialSkill() {
        super.specialSkill();
        System.out.println("베리 베리 보호막을 생성합니다!");
    }
}
