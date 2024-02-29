package quiz2.quiz4;

public class Mage extends Character implements Attackable{
    Mage(String name) {
        super(name);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name+"은(는) "+target.name+"에게 마법 공격을 합니다. 불의 화살!");
    }
}
