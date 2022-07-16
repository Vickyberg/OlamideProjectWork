package ChapterSeven.StudentResultSystem;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Number of Students:");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter Number of Subjects:");
        int numberOfSubjects = input.nextInt();
        input.nextLine();


        GradeBook gradeBook = new GradeBook(numberOfStudents,numberOfSubjects);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Enter Student %s",i+1+" name: ");
            System.out.println();
            String studentName = input.nextLine();
            gradeBook.addStudent(i,studentName);

        }
        for (int j = 0; j < numberOfSubjects; j++) {
            System.out.printf("Enter Subject %s:", j+1);
            System.out.println();
            String subjectName = input.nextLine();
            gradeBook.addSubject(j,subjectName);
        }
        for(int student = 0; student < numberOfStudents; student++){
            for (int  subject = 0; subject< numberOfSubjects ; subject++) {
                System.out.printf("Enter %s's score in %s: ", gradeBook.getStudent(student), gradeBook.getSubject(subject));
                int score = input.nextInt();
                gradeBook.addScore(student,subject,score);

            }
        }



    }
}
