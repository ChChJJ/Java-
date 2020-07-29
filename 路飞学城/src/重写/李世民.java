package chongxie;

public class 李世民 extends 李渊{

    //重写： 子类中的方法必须和父类中的方法完全一致
    public void buildCountry(){
        //半盖
        super.buildCountry(); //super可以调用父类中被重写的方法

        System.out.println("李世民也想建立一个自己的国家");
    }

    public static void main(String[] args) {
        李世民 lsm = new 李世民();
        lsm.buildCountry();
        System.out.println();
    }
}
