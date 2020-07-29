package 异常处理_throws和throw;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

//    public static void read() throws Exception{  //表示这个方法会抛出去Exception这样的错误，产生的什么就扔什么
//
//            InputStream is = new FileInputStream(new File("hahahaha"));  //读取文件要准备的流
//
//    }

    public static void chu(int a, int b) throws Exception{  //告诉外面我要扔出错误
        if (b==0){
            throw new Exception("你不可以给我一个0");   //这是真正的向外抛出异常
        } else {
            System.out.println(a/b);
        }
    }

    public static void main(String[] args){
        //或者
//        try {
//            read();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        read();

        try {
            chu(2,1);  //alt+enter选择处理异常的方式
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}








