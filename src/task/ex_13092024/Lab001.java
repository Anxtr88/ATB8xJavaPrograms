package task.ex_13092024;

import java.util.Arrays;

public class Lab001 {
    public static void main(String[] args) {
//      1.  Write a program to print the table of number which user will give( int num 10)
//        output will be like this (by using the printf()
//                10 × 1 = 10
//                10 × 2 = 20
//                10 × 3 = 30….
//        10 × 10 = 100.
        int num = 10;
        System.out.printf("%d x %d = %d", num,1,num*1);
        System.out.println();
        System.out.printf("%d x %d = %d", num,2,num*2);
        System.out.println();
        System.out.printf("%d x %d = %d", num,3,num*3);
        System.out.println();
        System.out.printf("%d x %d = %d", num,4,num*4);
        System.out.println();
        System.out.printf("%d x %d = %d", num,5,num*5);
        System.out.println();
        System.out.printf("%d x %d = %d", num,6,num*6);
        System.out.println();
        System.out.printf("%d x %d = %d", num,7,num*7);
        System.out.println();
        System.out.printf("%d x %d = %d", num,8,num*8);
        System.out.println();
        System.out.printf("%d x %d = %d", num,9,num*9);
        System.out.println();
        System.out.printf("%d x %d = %d", num,10,num*10);
        System.out.println();

//        2.    Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
//        double a = 34;
//        double b = 10;
//        Print - a+b, a-b, ab, a/b, a%b all the outputs.

        double a = 34;
        double b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


    }
}