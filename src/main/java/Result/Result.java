package Result;

/* Prompt the user to enter his/her score
The user enters the score
if the score is above 55, it prints pass
if the score is below 55, it prints fail */


import java.util.Scanner;
public class Result {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Score:");
        int result = input.nextInt();
        int score = 55;
        if (result >= score) {
            System.out.printf("PASS!!!" );
        }
        if (result < score){
            System.out.printf("FAIL!!!" );
        }
    }
}

