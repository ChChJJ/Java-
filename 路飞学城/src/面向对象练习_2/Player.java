package 面向对象练习_2;

public class Player{

    public void happy(Game game){
        game.start();   //一定是父类的方法
        game.play();  //有可能是子类的方法，具体看子类是否有重写父类的方法（就近原则）
        System.out.println("开心");
        game.end();     //一定是父类的方法

        System.out.println(); //回车
    }
}
