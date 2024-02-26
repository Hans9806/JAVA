package JavaTest.ex7;

public class GameCharacter {
    String name;
    int level;
    int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + "이 공격합니다!! ");
    }

    void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name+"이 공격 받았습니다. "+damage+"를 입어 체력이 "+health+"남았습니다. ");
    }
}
