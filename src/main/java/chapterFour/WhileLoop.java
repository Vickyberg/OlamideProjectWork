package chapterFour;

import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10){
            System.out.print("Enter grade:");
            int grade = input.nextInt();

            total = total + grade;

            gradeCounter = gradeCounter + 1;

        }
        int averageGrade = total / 10;
        System.out.printf("%nThe Total score is %d%n", total);
        System.out.printf("Average grade is %d%n" , averageGrade);




    }

}
