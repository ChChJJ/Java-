package 其他;

class Hero{
    String name;
    String skill_q;
    String skill_w;
    String skill_e;
    String skill_r;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, String skill_q, String skill_w, String skill_e, String skill_r) {
        this(name);  //调用当前类中其他的构造方法
        this.skill_q = skill_q;
        this.skill_w = skill_w;
        this.skill_e = skill_e;
        this.skill_r = skill_r;
    }

    public void kill() {
        System.out.println(this.name+"上阵杀敌");
    }

    public static void main(String[] args) {
        Hero h = new Hero("盖伦", "小宝剑", "防御", "龙卷风", "大宝剑");
        h.kill();
    }
}