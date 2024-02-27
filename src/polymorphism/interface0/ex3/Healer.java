package polymorphism.interface0.ex3;

public class Healer extends Character implements Healable{
    Healer(String name) {
        super(name);
    }

    @Override
    public void heal(Character target) {
        System.out.println(name+ "은(는) "+target.name+"을(를) 치유합니다. 치유의 빛!");
    }
}
