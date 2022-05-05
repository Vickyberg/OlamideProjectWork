package chapterFour;
/*
pseudocode;
The number of each item sold is entered by the salesperson
the number of the item is multiplied by its value
The gross  in a week is calculated by the summation  of each item
Since the commission is calculated by 9% of gross in a week then
earnings of the salesperson is summation of commission plus weekly salary
 */

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of item 1 sold: ");
        double item1 = input.nextDouble();

        System.out.println("Enter the number of item 2 sold: ");
        double item2 = input.nextDouble();

        System.out.println("Enter the number of item 3 sold: ");
        double item3  = input.nextDouble();

        System.out.println("Enter the number of item 4 sold: ");
        double item4  = input.nextDouble();

        double weeklySalary = 200;

        double grossSalesInTheWeek = (item1 * 239.99) + (item2 * 129.75) + (item3  * 99.95) + (item4  * 350.89);

        double commission = grossSalesInTheWeek * 0.09;

        double earnings = weeklySalary + commission;

        System.out.println("Value of earnings: " + earnings);

    }
}
