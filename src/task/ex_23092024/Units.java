package task.ex_23092024;

//Write a program that converts between different units
// (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
//        Input. -
//choice - 1 - km → m, km → 1km
//choice - 2 - f → c, f → c

public class Units {
    public static void main(String[] args) {
        float kilometers = 2;
        float Celsius = 2;
        switch ("Celsius") {
            case "kilometers":
                System.out.println("kilometers:" + kilometers + " Miles:" + kilometers * 0.621371);
                break;
            case "Celsius":
                System.out.println("Celsius:"+ Celsius+ " Fahrenheit:" + ((Celsius * 9/5) + 32));
                break;

        }

    }

}
