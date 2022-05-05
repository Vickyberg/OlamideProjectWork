package chapterFour;
/*
pseudocode:
    number of mileage is entered by the user
    amount of gallons used is entered by the user
    the total mileage and total gallon used are initialized to be 0
    miles per gallon used is initialized
 **/

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int mileage;
        int gallon;
        int totalMileage = 0;
        int totalGallon = 0;
        int counter = 1;
        double milesPerGallonUsed ;
        double average ;

        System.out.print("Enter a mileage (or -1 to quit):");
        mileage = input.nextInt();

        System.out.print("Enter gallon used (or -1 to quit):");
        gallon = input.nextInt();

        average = (double) mileage / gallon;

        System.out.printf("The miles per gallon used is: %.2f%n", average);

        while (mileage != -1 && gallon != -1){
            totalMileage += mileage;
            totalGallon += gallon;
            counter += 1;

            System.out.print("Enter mileage (or -1 to quit):");
            mileage = input.nextInt();

            System.out.print("Enter gallon used ( or -1 to quit):");
            gallon = input.nextInt();

            average = (double) mileage / gallon;
            System.out.printf("The  miles per gallon used is: %.2f%n", average);
        }
        if(counter != 0){
            milesPerGallonUsed = (double) totalMileage / totalGallon;

            System.out.printf("The Combined miles per gallon used for the trips is: %.2f%n", milesPerGallonUsed);

        }
    }
}
