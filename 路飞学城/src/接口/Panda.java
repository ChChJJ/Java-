package 接口;

//Java中类可以继承一个类，但可以实现多个接口
public class Panda extends Animal implements Valuable, Protectable{

    @Override //重写。 表示这个方法是重写的
    public void eat() {
        System.out.println("熊猫吃竹子");
    }

    @Override
    public void Protected() {
        System.out.println("熊猫集中在四川保护区里");
    }

    @Override
    public void getMoney() {
        System.out.println("熊猫是保护动物，熊猫很值钱");
    }
}
