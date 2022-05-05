package chapterFour;
/*
this application determines the winner of a sales contest
the number of units sold by each salesperson
this application is limited to enter the maximum of ten salesperson units
 */

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int counter ;
        int largest ;

        System.out.print("Enter number of unit: ");
        largest = input.nextInt();

    counter = 1;

        while (counter < 10){
            System.out.print("Enter number of unit: ");
            number = input.nextInt();
            if(number > largest)
                largest = number;
                counter++ ;

        }
        System.out.printf("The largest Number is %d", largest);
    }
}
