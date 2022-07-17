package ChapterSeven.CreatingAndManipulationOfArray.GradeBook;

public class GradeBookTest {
    public static void main(String[] args) {
        int [] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook gradeBook = new GradeBook("INTRODUCTION TO JAVA PROGRAMMING",gradesArray);
        System.out.printf("WELCOME TO THE GRADE BOOK FOR %s%n%n", gradeBook.getCourseName());

        gradeBook.processGrades();
    }
}
