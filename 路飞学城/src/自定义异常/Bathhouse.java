package 自定义异常;

public class Bathhouse {

    public void man(Person p) throws GenderException{
        if(p.gender.equals("男")){
            System.out.println("洗个痛快澡");
        } else {    //来了个女的
            //需要抛出异常
            throw new GenderException("你进错了，这里是男澡堂子。");
        }
    }
}
