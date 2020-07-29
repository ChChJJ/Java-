package 参数传递的问题;

public class Main {

    public static void change(Cat c) {
//         c = new Cat("虹猫");  //输出蓝猫
        c.name = ("虹猫");  //输出虹猫
    }


    public static void main(String[] args) {
        Cat c = new Cat("蓝猫");
        change(c);
        System.out.println(c.name);
    }
}
