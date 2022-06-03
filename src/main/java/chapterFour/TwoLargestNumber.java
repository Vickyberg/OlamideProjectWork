package chapterFour;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int counter ;
        int largest;
        int nextLargest = 0;

        System.out.print("Enter number of unit: ");
        largest = input.nextInt();

            System.out.print("Enter number of unit: ");
            number = input.nextInt();

            if(number > largest){
                nextLargest = largest;
                largest = number;
            }else
                nextLargest = number;
            counter = 1;
            while(counter < 10){
                System.out.print("Enter number of unit: ");
                number = input.nextInt();

                if(number > largest){
                    nextLargest = largest;
                    largest = number;
                }
                else if (nextLargest > nextLargest)
                    nextLargest = number;

                counter++;
            }

        System.out.printf("Largest is %d\nSecond largest is %d\n", largest,nextLargest);

    }
}
