package ChibobAss;

import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);

        System.out.print("Guess a random number: ");
        int number = guess.nextInt();

        int i = 25;
        while (number != i) {
            if (number > i) {
                System.out.println("Too high,Try again");
            }
            if (number < i) {
                System.out.println("Too low, Try again");
            }
            System.out.print("You have to guess the mystery number,Try again: ");
            number = guess.nextInt();
        }
            System.out.println("You're correct. Excellent!! ");



    }
}
