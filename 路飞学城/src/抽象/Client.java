package 抽象;

public class Client {
    public static void main(String[] args) {
        Cat c = new Cat();  //此处是多态性  //或 Animal c = new Cat()
        c.eat();
        c.move();

        //Animal ani = new Animal(); //'Animal' is abstract; cannot be instantiated
    }
}
