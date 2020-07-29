package 面向对象练习_3接口;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请问你要连接的数据库是: 2、Oracle  1、Mysql");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        IDAO dao; //在外面声明变量

        if(n==1){
            System.out.println("正在连接Myql……");
             dao = new MysqlDao();

        } else {
            System.out.println("正在连接Oracle……");
             dao = new OracleDao();

        }
        dao.connect();
        dao.add();
        dao.del();
        dao.sel();
        dao.upd();
    }
}
