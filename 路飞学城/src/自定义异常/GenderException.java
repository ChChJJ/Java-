package 自定义异常;

public class GenderException extends Exception{
    //自己定义的异常必须要继承 Exception（必须处理） 或者是 RuntimeException（看心情处理）

    public GenderException(String msg){
        super(msg);//调用父类的构造方法。Exception(msg)
    }

}
