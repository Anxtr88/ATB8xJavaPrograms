package task.ex_20092024;
import java.lang.Math;

public class Ts_Lab2009 {
    public static void main(String[] args) {
//    By using Ternary Operators max between 3 numbers.
//    Input int - a,b,c - a = 10, b = 20, c = 45
//    Max → a,b,c → c

      int a = 10, b = 20, c = 45;
      int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
      System.out.println(max);

        //Ternary Operators to handle multiple conditions.

// Input → int score = 85

// String grade →

//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
        int score = 85;
        String grade = 85 >= 90 ? "Grade A" : "Grade B";
        System.out.println(grade);




    }
}
