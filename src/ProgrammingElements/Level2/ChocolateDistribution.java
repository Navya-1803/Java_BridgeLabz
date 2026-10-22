package ProgrammingElements.Level2;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        if (numberOfChildren > 0) {
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            System.out.println("The number of chocolates each child gets is "
                    + chocolatesPerChild
                    + " and the number of remaining chocolates are "
                    + remainingChocolates);
        } else {
            System.out.println("Number of children must be greater than zero");
        }

        input.close();
    }
}

