package equals和两个等号的区别;

public class Cat {
    String name;
    String color;

    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Boolean equals (Cat c){
        if(this.color == c.color){  //单纯自己写判断语句
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("小花", "white");    //第一只猫
        Cat c2 = new Cat("小花", "white");    //第二只猫

    /*
        System.out.println(c1 == c2);  //false
                // 双等判断的是两个对象的内存地址是否一致。一般用在基本数据类型上
        System.out.println(c1.equals(c2));  //false
                // 默认调用object提供的equals方法

     */
        System.out.println(c1.equals(c2));  //运行结果是true。此时调用的是子类里重写后的equals方法

    }
}
