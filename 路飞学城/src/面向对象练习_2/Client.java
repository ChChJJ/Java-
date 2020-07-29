package 面向对象练习_2;

public class Client {

    public static void main(String[] args) {
        Game game1 = new DNF();  //向上转型
        Game game2 = new LOL();
        Game game3 = new CF();

        Player p = new Player();
        p.happy(game1);
        p.happy(game2);
        p.happy(game3);
    }
}
