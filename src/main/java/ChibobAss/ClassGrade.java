package ChibobAss;

import java.util.Scanner;

public class ClassGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter the number of Subjects offered by each the Student: ");
        int numberOfSubject = input.nextInt();

        int[][] classRecord = new int[numberOfStudents][numberOfSubject] ;
        for(int i= 0; i <  numberOfStudents; i++){
            System.out.println("Enter score for each subject offered by student " + (i +1));
            for (int j= 0  ;j< numberOfSubject;j++){
                System.out.println("Enter the score for subject " + (j + 1));
                int scores = input.nextInt();
                classRecord[i][j] = scores ;
            }
            System.out.println();
        }



    }
}
