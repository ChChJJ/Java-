package 接口;

//public class Gold extends Valuable{}  //Class 'Gold' must either be declared abstract or implement abstract method 'getMoney()' in 'Valuable'
public class Gold implements Valuable{

    //必须实现(重写)抽象方法
    public void getMoney(){
        System.out.println("黄金可以换钱");
    }
}
