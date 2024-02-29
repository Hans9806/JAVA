package quiz2.quiz4;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("전사");
        Mage mage = new Mage("마법사");
        Healer healer = new Healer("힐러");

        warrior.attack(mage);
        mage.attack(warrior);
        healer.heal(warrior);
    }
}
