package 继承;

public class Main {
    public static void main(String[] args) {
        黑熊精 黑熊怪 = new 黑熊精();
        System.out.print("黑熊精");黑熊怪.eat();
//        黑熊精.怕是(); 私有内容是不能被继承的
        黑熊怪.name = "大黑熊";
        System.out.println("黑熊怪的名字是:"+黑熊怪.name);
        黑熊怪.Steal();
    }
}
