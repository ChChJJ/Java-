package com.google.www;

public class TestPerson {
    public static void main(String[] args) {
        Person p =new Person();
//        p.name = "张三";
//        p.gender = "male";
//        p.age = -1;  //语法是没有问题，但是逻辑上有漏洞

        p.setName("张三");
        p.setGender("Male");
        p.setAge(10);

        System.out.println("这个人的名字是："+p.getName()+" 性别是："+p.getGender()+" 年龄是"+p.getAge());
        System.out.print("张三在");p.eat();
    }
}






















