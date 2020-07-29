package 抽象;

public abstract class Animal {  // 类中只要有抽象方法那么这个类也必须是抽象类

    //abstract抽象的 —— 修饰方法，这个方法就是一个抽象方法
        //抽象方法没有方法体，直接以分号结束（因为抽象的意思是想象出来，现实中不存在的）
    public abstract void eat();

    public abstract void move();

    //抽象类可以有正常的方法
    public void run(){

    }

}
