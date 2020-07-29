package 异常处理;

public class Test {
    public static void main(String[] args) {
        try{
//            System.out.println(1/0);  //0不能做除数
            System.out.println(1/1);
        } catch(Exception e){
            e.printStackTrace();    //打印错误信息
            System.out.println("系统出错了，请联系管理员"); //一般是给客户看的
        } finally{  //一般做收尾工作
            System.out.println("你好，我是finally");
        }

    }
}
