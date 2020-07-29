package 接口;

/*
*   能继承接口的只能是接口。（猴子生出来的只能是猴子不可能是孙悟空）
*   接口和类只能是实现关系 implements
*
* */

public interface Valuable { //接口使用 interface 来声明，不属于class (类)

    //接口中所有的方法都是抽象方法，可以省略 abstract
    //接口中所有的内容都默认是 public
    public void getMoney();

    int money = 100;  //前面隐含了 public static final
}
