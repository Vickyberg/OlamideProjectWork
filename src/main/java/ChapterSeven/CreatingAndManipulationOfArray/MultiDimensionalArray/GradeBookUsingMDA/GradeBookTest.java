package ChapterSeven.CreatingAndManipulationOfArray.MultiDimensionalArray.GradeBookUsingMDA;

public class GradeBookTest {
    public static void main(String[] args) {
        int [][] gradeArrays = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};

        GradeBook gradeBook = new GradeBook("Introduction to Java ",gradeArrays);
        System.out.printf("%s%n%s%s%n%s%n","=".repeat(50),"Welcome to grade book for ",gradeBook.getCourseName(),"=".repeat(50));
        gradeBook.processGrades();
    }
}
