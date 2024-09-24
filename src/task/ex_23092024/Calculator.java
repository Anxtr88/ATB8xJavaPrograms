package task.ex_23092024;

//Create a simple calculator that performs addition, subtraction, multiplication, and division,
// modus based on user input using switch statements.
//        Inputs :   num 1, num 2, +
//Output :  num1+num2 → print information.
public class Calculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        switch ("sub") {
            case "add":
                System.out.println(num1 + num2);
                break;
            case "sub":
                System.out.println(num1 - num2);
                break;
            case "mul":
                System.out.println(num1 * num2);
                break;
            case "div":
                System.out.println(num1 / num2);
                break;
            case "mod":
                System.out.println(num1 % num2);
                break;
//////////////////////// OR////////////////////////////
//            int num1 = 10, num2 = 25;
//            char operator = '-';
//            System.out.printf("Ans1: ");
//            switch (operator) {
//                case '+' -> System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
//                case '-' -> System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
//                case '*' -> System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
//                case '/' -> System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
//                case '%' -> System.out.printf("%d % %d = %d", num1, num2, num1 % num2);
//                default -> System.out.printf("This is not a valid operator");
//            }
//            System.out.println();
        }
    }
}
