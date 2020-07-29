package 面向对象练习_3接口;

public abstract class AbstractDao implements IDAO{
    //隐藏了一个抽象方法 —— void connect();

    @Override
    public void add() {
        System.out.println("新增");
    }

    @Override
    public void del() {
        System.out.println("删除");
    }

    @Override
    public void sel() {
        System.out.println("查找");
    }

    @Override
    public void upd() {
        System.out.println("更新");
    }
}
