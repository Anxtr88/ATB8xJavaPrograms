package task.ex_23092024;

//Write a program that takes an integer input (1-12) and
// prints the name of the corresponding month using a switch statement.
//        Input  - 12
//Out - Dec.

public class month {
    public static void main(String[] args) {
        int month = 12;
        switch(month){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Not a valid month");
        }



    }
}
