package equals和两个等号的区别;

public class Main {

    public static void main(String[] args) {
        String str1 = "小红";  //true
        String str2 = "小红";  //true //第二个的小红并没有单独占用内存空间

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("小白");
        String str4 = new String("小白");

        System.out.println(str3 == str4);   //false    //判断的是地址
        System.out.println(str3.equals(str4));  //true  //判断两个字符串的内容是否一致
    }
}
