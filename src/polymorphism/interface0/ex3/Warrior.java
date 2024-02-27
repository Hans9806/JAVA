package polymorphism.interface0.ex3;

class Warrior extends Character implements Attackable {
    Warrior(String name) {
        super(name);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name+ "이(가) "+target.name+"을(를) 공격합니다. 강한 공격!");
    }
}
