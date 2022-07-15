package ChapterSeven.CreatingAndManipulationOfArray.GradeBook;

public class GradeBook {
    private String courseName;
    private int [] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrades(){
        outPutGrades();

        System.out.printf("%n Class Average is %.2f%n", getAverage());
        System.out.printf("Lowest grade: %d%n Highest grade: %d%n",getMinimum(),getMaximum());

        outputBarChart();
    }

    public int getMinimum(){
        int lowGrade = grades[0];

        for(int grade : grades ){
            if(grade < lowGrade){
                lowGrade = grade;
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0];
        for (int grade : grades){
            if(grade > highGrade){
               highGrade = grade;
            }
        }
        return highGrade;
    }

    public double getAverage(){
        double total = 0;
        for(int grade : grades){
            total += grade;
        }
        return (double)total/ grades.length;
    }

    public void outputBarChart(){
        System.out.println();
        System.out.println("GRADE DISTRIBUTION");

        int [] frequency = new int[11];

        for(int grade : grades){
            ++frequency[grade/10];
        }
        for (int i =0; i < frequency.length; i++){
            if( i == 10){
                System.out.printf("%5d: ",100);
            }else {
                System.out.printf("%02d-%02d: ",(i *10), (i *10 +9));
            }
            for(int star = 0; star <frequency[i]; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  void outPutGrades(){
        System.out.printf("The grades are: %n%n");
        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d: %3d%n",student+1,grades[student]);
        }
    }
}
