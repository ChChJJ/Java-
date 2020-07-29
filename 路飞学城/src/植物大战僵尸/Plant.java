package 植物大战僵尸;

public class Plant {
    String name;
    int hp;
    int attack;
    public Plant(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    //植物打僵尸
    public void fight(Zombie z) {
        System.out.println(this.name+"在打"+z.name);
        //僵尸掉血
        z.hp -= this.attack;
        System.out.println("僵尸的血量剩余"+z.hp);
    }
}
