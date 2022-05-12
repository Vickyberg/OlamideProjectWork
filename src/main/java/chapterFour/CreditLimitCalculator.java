package chapterFour;
/*
Pseudocode:
   - this application is to determine whether any of several department-store customers has exceeded the credit limit on a charge account
   - each customer has there account number
   - has there balance at the beginning of the month
   - total of all items charged by the customer this month
   - total of all credits applied to the customer's account this month
   - allowed credit limit

 */

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int itemsCharged;
        int creditsApplied ;
        int creditLimit ;
        int newBalance ;

        System.out.println("Enter customer's account number(or enter -1 to quit): ");
         accountNumber = input.nextInt();
         if(accountNumber != -1){
             System.out.println("Enter customer's beginning balance: ");
             beginningBalance = input.nextInt();
             if(beginningBalance < 0){

                 System.out.println("Enter your beginning  balance : ");
                 beginningBalance = input.nextInt();
             }
             while (accountNumber != 0) {
                 System.out.println("Enter your item charged: ");
                 itemsCharged = input.nextInt();

                 if (itemsCharged > 0){
                     System.out.println("Enter your item charged this month: ");
                     itemsCharged = input.nextInt();
                 }
                 System.out.println("Enter credit applied to the customer: ");
                 creditsApplied = input.nextInt();

                 System.out.println("Enter credit limit for the customer: ");
                 creditLimit = input.nextInt();

                 newBalance = beginningBalance + itemsCharged - creditsApplied;

                 if(newBalance > creditLimit){
                     System.out.println("Credit Limit Exceeded");
                 }

             }
         }

    }
}
