package ProgrammingElements.Level1;


import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double baseInches = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        double areaSquareInches = 0.5 * baseInches * heightInches;
        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;
        double areaSquareCm = 0.5 * baseCm * heightCm;

        System.out.println("The area of triangle in square inches is " + areaSquareInches);
        System.out.println("The area of triangle in square centimeters is " + areaSquareCm);

        input.close();
    }
}

