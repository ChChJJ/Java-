package 其他;

public class 通用构造器和静态构造器{
    {
        System.out.println("这里是通用构造器");
    }
    static {
        System.out.println("这里是静态构造器");
    }

    public 通用构造器和静态构造器(){
        System.out.println("构造方法");
    }

    String name;
    public static void chi(){
        //System.out.println(this.name);  不允许这样写，静态内容优先于对象产生
    }

    public static void main(String[] args){
        new 通用构造器和静态构造器();
    }
}