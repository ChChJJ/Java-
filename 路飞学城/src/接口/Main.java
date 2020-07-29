package 接口;

public class Main {
    public static void main(String[] args) {
        //Gold g = new Gold();
        Valuable g = new Gold();    //接口一样也具有多态性
        g.getMoney();

        Panda p = new Panda();
        Animal ani = new Panda();  //向上转型
        Valuable v = new Panda();  //向上转型
        Protectable pro = new Panda();  //向上转型

//        p.eat();
//        p.getMoney();
//        p.Protected();

        ani.eat();
//        ani.Protected();    //报错：因为站在动物的角度只能吃
//        ani.getMoney();   //也不行

        v.getMoney();
        pro.Protected();

        //Valuable.money = 10;    //无法为最终变量money分配值
        System.out.println(Valuable.money);
    }
}
