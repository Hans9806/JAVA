package polymorphism.interface0.animal2;

public class Penguin extends Animal implements Swimable,Flyable{
    @Override
    public void sound() {
        System.out.println("뒤뚱뒤뚱");
    }

    @Override
    public void swim() {
        System.out.println("펭귄이 수영을 합니다.");
    }

    @Override
    public void fly() {
        System.out.println("펭귄이 날개짓을 합니다.");
    }
}
