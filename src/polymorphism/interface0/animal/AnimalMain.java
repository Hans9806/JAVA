package polymorphism.interface0.animal;

import polymorphism.abstraction.pure.Animal;
import polymorphism.abstraction.pure.Cat;
import polymorphism.abstraction.pure.Dog;
import polymorphism.abstraction.pure.Mouse;
import polymorphism.abstraction.pure.Tiger;

public class AnimalMain {
        public static void main(String[] args) {
            polymorphism.abstraction.pure.Cat cat = new polymorphism.abstraction.pure.Cat();
            polymorphism.abstraction.pure.Dog dog = new polymorphism.abstraction.pure.Dog();
            Mouse mouse = new Mouse();
            Tiger tiger = new Tiger();

            sound(mouse);
            sound(dog);

            move(cat);
            move(dog);
        }
        // 매개변수로Animal 인터페이스를 받는다.
        // 인터페이스를 구현한 클래스들을 다형적 매개변수로 받을 수 있다.
        static void sound(polymorphism.abstraction.pure.Animal animal) {
            animal.sound();
        }

        static void move(polymorphism.abstraction.pure.Animal animal) {
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


