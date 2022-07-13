package ChapterEleven;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer value for Numerator: ");
        int numerator = input.nextInt();

        System.out.println("Enter a integer value for Denominator: ");
        int denominator = input.nextInt();

        int result = quotient(numerator,denominator);

        System.out.printf("%n Result: %d / %d = %d%n", numerator,denominator,result);

    }
    public static int quotient(int numerator,int denominator){
        return numerator / denominator;
    }
}
