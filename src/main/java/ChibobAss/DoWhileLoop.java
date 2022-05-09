package ChibobAss;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the Second number: ");
        int secondNumber = input.nextInt();
        int sum;
        int redo;

        do{
            sum = firstNumber + secondNumber;
            System.out.println("The sum is: "+ sum);

            System.out.println("Enter a number greater than 0 (or enter 0 to quit)");
            redo = input.nextInt();
        }while ( redo > 0);
    }
}
