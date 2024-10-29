package oct.ex_11102024.accessmodifier.police;

public class Cop {
    private int gun;
    private String idcard;

    public Cop(int gun, String idcard) {
        this.gun = gun;
        this.idcard = idcard;
    }

    protected void canIshoot(){
        System.out.println("Yes you can");
        System.out.println(gun);
    }

}


