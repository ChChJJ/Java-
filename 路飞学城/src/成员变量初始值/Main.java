package 成员变量初始值;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("byte "+p.b);
        System.out.println("short "+p.s);
        System.out.println("int "+p.i);
        System.out.println("long "+p.l);
        System.out.println("float "+p.f);
        System.out.println("double "+p.d);
        System.out.println("char "+(int)p.c);
        System.out.println("Boolean "+p.bool);

        System.out.println("String "+p.str);
        System.out.println("Child "+p.child);
    }
}
