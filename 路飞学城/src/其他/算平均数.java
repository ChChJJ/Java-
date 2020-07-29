package 其他;

import java.util.Scanner;

public class 算平均数 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 0;

        System.out.println("请输入数字");

        number = in.nextInt();
        while( number != -1)
        {
            sum = sum + number;
            count++;
            number =in.nextInt();
        }
        if( count>0 )
        {
            System.out.println("平均数=" + (double)sum/count);
        }
        in.close();
    }

}
