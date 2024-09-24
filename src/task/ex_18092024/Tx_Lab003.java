package task.ex_18092024;

public class Tx_Lab003 {
    public static void main(String[] args) {

// Give some another example of Widening with Implicit and Explicit,Narrowing with implicit and explicit.
        int value = 300;
        byte b = (byte)value; // Narrowing
        System.out.println(b);

        int value2 = 300000;
        double d = value2; // Widening
        System.out.println(d);

        int a = 10;
        System.out.println(--a + a--  + a--);  // 9 + 9 + 8 = 26
        System.out.println(a);  // 7

        int a1 = 10;
        System.out.println(--a1 + a1++ + a1--); // 9 + 9 + 10 = 28
        System.out.println(a1); // 9

        int a2 = 10;
        System.out.println(a2-- + a2--  + a2--); // 10 + 9 + 8 = 27
        System.out.println(a2); // 7

    }
}
