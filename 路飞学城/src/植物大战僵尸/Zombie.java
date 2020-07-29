package 植物大战僵尸;

public class Zombie {
    String name;
    int hp;
    int attack;

    public Zombie(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void eat(Plant p) {
        System.out.println(this.name+"正在吃"+p.name+"植物");
        p.hp -= this.attack;
        System.out.println("植物的血量剩余：" + p.hp);
    }
}
