package equals和两个等号的区别;

import java.util.Scanner;

public class 小练习 {

    public static void main(String[] args) {
        String username = "admin";
        String password = "123";

        Scanner in = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String uname = in.nextLine();

        System.out.println("请输入密码：");
        String upwd = in.nextLine();

        //判断用户名和密码是否一致 —— equals来判断
        if (uname.equals(username) && upwd.equals(password)){
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

    }
}
