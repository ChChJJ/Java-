package 面向对象练习_3接口;

public class OracleDao extends AbstractDao{
    @Override
    public void connect() {
        System.out.println("Oracle连接成功");
    }

}
