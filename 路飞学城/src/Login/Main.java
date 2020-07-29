package Login;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        member.login();

        Admin admin = new Admin();
        admin.login();
    }
}
