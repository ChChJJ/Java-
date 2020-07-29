package Super关键字;

import com.sun.source.doctree.SummaryTree;
import org.w3c.dom.ls.LSOutput;

public class SunWuKong extends Hero{

    String name = "泼猴";

    public SunWuKong(){
       // super(); //程序还原。在子类构造方法的第一行会默认调用父类的构造方法，并且对super的调用必须是构造器中的第一个语句
        System.out.println("我是子类的构造方法");
    }

    public void eat(){
        System.out.println(this.name+"在偷吃蟠桃");
                //this.name —— 变量查找顺序：先在自己类里查找，找不到再去父类里找（就近原则）
        //想看到父类里的name
        System.out.println(super.name+"在吃蟠桃");
    }

    public static void main(String[] args) {
        SunWuKong swk = new SunWuKong();
        swk.eat();
    }
}
