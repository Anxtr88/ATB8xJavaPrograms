package oct.ex_14102024.Abstraction.ex3_Interface;

public class Lab147 {
    public static void main(String[] args) {
        test t =  new test();
        t.f1();


    }
}

class test implements I1{

    @Override
    public void f1() {
        System.out.println("Created P");
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface I1 {
    void f1();
    void f2();
    void f3();

}