package ChibobAss;

import java.util.Scanner;

public class PrimeNumberIndicator {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int number = prime.nextInt();
        int i;
        int commonFactor = 0;
        for (i = 1; i <= number; i++) {
            if (number % i == 0) {
                commonFactor += 1;
            }
        }
        if(commonFactor == 2){
            System.out.println("This is a prime number!!");
        }else
        System.out.println("This is not a prime number");
    }
}
