package ChapterFive;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        int i = 3;
        int sum = 0;
        while(i % 3 == 0 && i <= 30){
            sum = sum + i;
            i += 3;
        }
        System.out.printf("Sum is: %d%n ",  sum);
    }
}
