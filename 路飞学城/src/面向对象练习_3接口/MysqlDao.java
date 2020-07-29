package 面向对象练习_3接口;

public class MysqlDao extends AbstractDao{
    @Override
    public void connect() {
        System.out.println("MySQL连接成功");
    }

}
