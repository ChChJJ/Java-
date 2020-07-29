package 植物大战僵尸;

public class 草地 {
    public static void main(String[] args) {
        //创建植物和僵尸
        Plant p = new Plant("豌豆", 1000, 10);

        Zombie z = new Zombie("橄榄运动员僵尸", 800, 20);

        p.fight(z);
        z.eat(p);
    }




}
