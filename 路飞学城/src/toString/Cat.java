package toString;

public class Cat {  //类默认会自动继承 Object
    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //子类对父类的方法不满意 —— 重写


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cat c = new Cat("小红", "白色");

        //直接打印这只猫
        System.out.println(c);
        //默认打印对象，会自动执行这个对象的toString()的方法
                //System.out.println(c.toString());
        //默认的toString() ——> 包名.类@内存地址

    }
}
