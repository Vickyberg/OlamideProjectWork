package ChapterSix;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int sum ;
        System.out.print("Enter four digits: ");
        int number = user.nextInt();


        for (sum = 0; number != 0; number = number / 10) {
            sum = sum + number % 10;

        }
        System.out.println("The sum = " + sum);


    }
}
