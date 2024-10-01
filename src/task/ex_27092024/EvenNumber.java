package task.ex_27092024;

public class EvenNumber {
    public static void main(String[] args) {
//        Create a Java program that prints the first 5 even numbers using a do-while loop.
        int i = 1;
        do {
            if (i%2 == 0){
                System.out.println("Even: "+ i);
            }i++;
        }while (i<= 5);
    }
}
