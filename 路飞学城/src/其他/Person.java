package 其他;

public class Person {
    String name;
    String address;
    static String country = "大清";   // static修饰后的是共享的

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Person p1 = new Person("张三", "八大胡同");
        Person p2 = new Person("李四", "朝阳门");

        //改朝换代 —— 大清亡了
        //p1.country = "民国"; static 修饰后只需修改一个人的，其余的也会跟着一起改变
        //p2.country = "民国";  推荐使用类名去访问静态内容
        Person.country = "民国";
        System.out.println(p1.country);
        System.out.println(p2.country);
    }

}














