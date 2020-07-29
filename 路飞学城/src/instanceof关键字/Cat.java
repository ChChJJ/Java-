package instanceof关键字;

public class Cat extends Animal{

    public static void main(String[] args) {
        Animal ani = new Cat();

        if (ani instanceof Cat) {   //判断ani是否是一只猫
            System.out.println("这只动物是一只猫");
        } else {
            System.out.println("这只动物不是一只猫");
        }

    }
}
