/* Prompt the user to enter his/her score
The user enters the score
if the score is above 90 - 100, it prints A
if the score is greater 79 but less than 90, it prints B
if the score is greater 69 but less than 80, it prints C
if the score is greater 59 but less than 70, it prints D
if the score is less than 60, it prints F
 */

import  java.util.Scanner;
public class Result {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);

        System.out.print("Pls enter your Score: ");
        int score = input.nextInt();


        if(score >= 90 && score <= 100){
            System.out.printf("A");
        }

        if(score >= 80 && score < 90){
            System.out.printf("B");
        }

        if(score >= 70 && score < 80){
            System.out.printf("C");
        }

        if(score >= 60 && score < 70){
            System.out.printf("D");
        }

        if(score < 60){
            System.out.printf("F");
        }


    }
}
