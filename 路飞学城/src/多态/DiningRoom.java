package 多态;

public class DiningRoom {

    public static void main(String[] args) {

        //把猫当成动物类 等价于 Cat c = new Cat(); 创建一只猫
        Animal ani1 = new Cat();   //把子类的对象赋值给父类的引用（变量），这又被称为向上转型
        Animal ani2 = new Dog();    //向上转型会屏蔽掉子类特有的方法
        Animal ani3 = new Rabbit();

        Person p = new Person();
        p.feed(ani1);
        p.feed(ani2);
        p.feed(ani3);
        //多态的作用： 把不同的数据类型进行统一

        //向下强转	 ——>	把动物转成猫
        Rabbit r = (Rabbit) ani3;
        r.jump();  //兔子可以跳的很快
        //ani1.Rabbitjump(); //报错：站在动物的角度，不是所有的动物都跳的很快

    }
}
