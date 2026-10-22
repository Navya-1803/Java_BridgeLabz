package ProgrammingElements.Level2;

import java.util.Scanner;

public class TravelCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter intermediate city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter destination city: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from starting city to intermediate city in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from intermediate city to destination in miles: ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter total travel time in hours: ");
        double time = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / time;

        System.out.println("Name: " + name);
        System.out.println("Travel route: " + fromCity + " -> "
                + viaCity + " -> " + toCity);
        System.out.println("Total distance: " + totalDistance + " miles");
        System.out.println("Average speed: " + averageSpeed + " miles per hour");

        input.close();
    }
}

