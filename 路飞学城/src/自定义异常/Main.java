package 自定义异常;

public class Main {

    public static void main(String[] args) throws GenderException{
        Person p1 = new Person("张无忌", "男");

        Person p2 = new Person("赵敏", "女");

        Bathhouse bh = new Bathhouse();

        bh.man(p1);
    }

}
