package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int digit1;
        int digit2;
        int digit4;
        int digit5;
        int digits;

        number = 0;
        digits = 0;

        while (digits != 5) {
            System.out.print("Enter a five digit number: ");
            number = input.nextInt();

            if (number < 100_000) {
                if (number > 9999)
                    digits = 5;
                else
                    System.out.println("Number must be five digits");
            } else
                System.out.println("Enter five digits to get a palindrome");
        }

            digit1 = number / 10_000;
            digit2 = number % 10_000 / 1000;
            digit4 = number % 10_000 % 1_000 % 100 / 10;
            digit5 = number % 10_000 % 1_000 % 100 % 10 ;

            System.out.print(number);

            if (digit1 == digit5) {
                if (digit2 == digit4)

                    System.out.println(" Number is a palindrome!!!");
                else
                    System.out.println(" is not a palindrome!!!");


            }
            else
                System.out.println(" is not a palindrome!!!");
        }

    }


