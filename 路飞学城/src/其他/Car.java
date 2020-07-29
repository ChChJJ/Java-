package 其他;

class Car{
    int speed;
    int seat;
    String color;

    public void run() {
        System.out.println(this.color);
        System.out.println(this.speed);
        System.out.println("车能跑");
    }
    public void fly(String color){
        System.out.println(this.color+"的车会飞，飞在"+color+"的颜色的云彩里");

        //System.out.println(color+"的车会飞");  //此时访问的也是成员变量
        //变量的查找顺序：现在自己的方法体里找，如果自己的方法体中没有则就去this里面找
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "粉红色";

        c.fly("white");
    }
} 