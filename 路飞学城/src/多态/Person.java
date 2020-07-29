package 多态;

public class Person {

    public void feed(Animal ani){ //接收到的所有动物都是Animal类
        ani.eat();
    }
}
