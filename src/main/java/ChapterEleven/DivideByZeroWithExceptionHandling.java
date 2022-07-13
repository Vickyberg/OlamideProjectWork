package ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop){
            try {
                System.out.println("Enter  integer value for Numerator: ");
                int numerator = input.nextInt();

                System.out.println("Enter  integer value for Denominator: ");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);

                System.out.printf("%n Result: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                input.nextLine(); // discard input so user can try again
                System.out.printf("You must enter integers. Please try again.%n%n");

            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }
        }
    }
    public static int quotient(int numerator,int denominator){
        return numerator / denominator;
    }
}
