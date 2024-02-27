package polymorphism.abstraction.pure;

public class AnimalMain {
        public static void main(String[] args) {
            Cat cat = new Cat();
            Dog dog = new Dog();
            Mouse mouse = new Mouse();
            Tiger tiger = new Tiger();

            sound(mouse);
            sound(dog);
            sound(cat);
            sound(tiger);

            move(cat);
            move(dog);
            move(mouse);
            move(tiger);

            eat(tiger);
        }

        // 스태틱 메서드로 매개변수의 다형성 구현
        // 동물이 추가되어도 코드가 변경되지 않는다.
        static void sound(Animal animal) {
            animal.sound();
        }

        static void move(Animal animal) {
            animal.move();
        }

        // 다형성이 적용되지 않았을 때 메서드 구현
        // 동물이 추가되면 코드가 변경되야 한다.
        static void soundMouse(Mouse mouse) {
            mouse.sound();
        }

        static void soundCat(Cat cat) {
            cat.sound();
        }

        static void soundDog(Dog dog) {
            dog.sound();
        }
        static void eat(Animal animal) {

        }
    }

