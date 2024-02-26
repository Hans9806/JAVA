package polymorphism.ex.ex4;

public class Gingerbread extends Cookie{
    @Override
    void run() {
        System.out.println("진저브레드 맨이 달립니다!");
    }

    @Override
    void jump() {
        System.out.println("진저브레드 맨이 작게 점프합니다.");
    }
}
