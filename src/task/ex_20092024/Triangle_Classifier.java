package task.ex_20092024;

public class Triangle_Classifier {
    public static void main(String[] args) {
        int side1 = 30;
        int side2 = 10;
        int side3 = 10;

        if (side1 == side2 && side1 == side3 && side2 == side3) {
            System.out.println("the triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("the triangle is isosceles");
        } else System.out.println("the triangle is scalene");

    }


    // Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->


}
