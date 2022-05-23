package ChapterSix;

import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter two sides of triangle ");
        double side1 = user.nextDouble();
        double side2 = user.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.printf("The hypotenuse = " + hypotenuse);

    }
}
