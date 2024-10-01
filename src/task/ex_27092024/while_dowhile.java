package task.ex_27092024;

public class while_dowhile {
    public static void main(String[] args) {
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("GameOver");

        //Print "Yatzy!" If the dice number is 6:
        int dice = 1;
        while (dice <= 6){
            if (dice == 6) {
                System.out.println("Yatzy!");
            }else System.out.println("No Yatzy!");
            dice++;
            }

        // do while
        int count = 3;
        do {
            System.out.println(count);
            count--;
        }
        while (count > 3);
        System.out.println("GameOver");
        }
    }




