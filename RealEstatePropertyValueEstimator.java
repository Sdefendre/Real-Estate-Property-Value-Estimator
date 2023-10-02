/*
Assignment Number: 3
Assignment Title: Real Estate Property Value Estimator
Program Author: Steve Defendre
date due: 10/04/2023
*/

import java.util.Scanner;

public class RealEstatePropertyValueEstimator {

    public static void main(String[] args) {

        // Declare variables
        String streetName, living, dining, bedroom1, bedroom2, kitchen;
        int streetNumber, livingArea, diningArea, bedroom1Area, bedroom2Area, kitchenArea, totalArea;
        double pricePerSqFt, estimatedValue;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for property details
        System.out.print("Enter street number: ");
        streetNumber = input.nextInt();

        System.out.print("Enter street name: ");
        streetName = input.nextLine();

        System.out.print("Enter living room name: ");
        living = input.nextLine();

        System.out.print("Enter area of " + living + " in sq. ft.: ");
        livingArea = input.nextInt();

        System.out.print("Enter dining room name: ");
        dining = input.nextLine();

        System.out.print("Enter area of " + dining + " in sq. ft.: ");
        diningArea = input.nextInt();

        System.out.print("Enter first bedroom name: ");
        bedroom1 = input.nextLine();

        System.out.print("Enter area of " + bedroom1 + " in sq. ft.: ");
        bedroom1Area = input.nextInt();

        System.out.print("Enter second bedroom name: ");
        bedroom2 = input.nextLine();

        System.out.print("Enter area of " + bedroom2 + " in sq. ft.: ");
        bedroom2Area = input.nextInt();

        System.out.print("Enter kitchen name: ");
        kitchen = input.nextLine();

        System.out.print("Enter area of " + kitchen + " in sq. ft.: ");
        kitchenArea = input.nextInt();

        System.out.print("Enter price per sq. ft.: ");
        pricePerSqFt = input.nextDouble();

        // Calculate total area and estimated property value
        totalArea = livingArea + diningArea + bedroom1Area + bedroom2Area + kitchenArea;
        estimatedValue = totalArea * pricePerSqFt;

        // Display the results
        int lineCount = 1;
        System.out.println(lineCount++ + ".                   Street: " + streetName + " #" + streetNumber);
        System.out.println(lineCount++ + ".              Total Rooms: 5 (" + living + ", " + dining + ", " + bedroom1 + ", " + bedroom2 + ", " + kitchen + ")");
        System.out.println(lineCount++ + ".               Total Area: " + totalArea + " sq. ft.");
        System.out.println(lineCount++ + ".         Price per sq. ft: $" + pricePerSqFt);
        System.out.println(lineCount++ + ". Estimated property value: $" + estimatedValue);

        input.close();

    }//main

}//end class RealEstatePropertyValueEstimator