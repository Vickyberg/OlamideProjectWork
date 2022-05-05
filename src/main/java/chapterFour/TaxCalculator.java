package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    /*
    This application is used to determine the total tax for each of three citizens
    The tax rate for any citizen earning up to 30,000 usd is 15% while
     The tax rate for any citizen earning more than 30,000 usd is 20%
     the names of the citizens are provided and there earnings in a year
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tax;

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your earnings: ");
        int earnings = input.nextInt();

        if (earnings <= 30_000){
            tax = 0.15 * earnings;
        } else {
            tax = 0.20 * earnings;
        }
        System.out.printf("%s Your tax is %.2f ", name , tax );

    }
}
