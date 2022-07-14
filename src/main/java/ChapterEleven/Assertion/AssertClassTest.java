package ChapterEleven.Assertion;

import java.util.Scanner;

public class AssertClassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in range 0-10  ");
        int number = input.nextInt();

        assert (number >= 0 && number <= 10) : "Bad Number: " + number ;

        System.out.printf("You entered  %d%n" , number);
    }
}
