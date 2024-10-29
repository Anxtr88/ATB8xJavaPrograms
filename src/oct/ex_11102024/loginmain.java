package oct.ex_11102024;

public class loginmain {
    public static void main(String[] args) {

        logindata login = new logindata("pass123", "admin");
        System.out.println(login.getPassword());
        System.out.println(login.getUsername());
        login.setPassword("hacker", true);
        System.out.println(login.getPassword());





    }
}
