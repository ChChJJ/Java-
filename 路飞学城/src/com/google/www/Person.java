package com.google.www;

public class Person {
    //成员变量是私有的，就不能被外界访问
    private String name;
    private String gender;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        //是方法就可以进行判断
        //有效的保护成员变量，不被恶意赋值
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public void eat(){
        System.out.println("吃东西");
    }
}








