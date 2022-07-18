package ChapterSeven.StudentResultSystem;

public class GradeBook {
    String [] student;
    String [] subject;
    double [] total;


     int [][] scores;

    public GradeBook(int numberOfStudents, int numberOfSubjects) {
        student = new String[numberOfStudents];
        subject = new String[numberOfSubjects];
        scores = new int[numberOfStudents][numberOfSubjects];
    }


    public void addStudent(int indexOfStudent, String studentName){
        student[indexOfStudent] = studentName ;

    }

    public String getStudent(int indexOfStudent){
        return student[indexOfStudent];

    }
    public void addSubject(int indexOfSubject, String subjectName){
        subject[indexOfSubject] = subjectName;
    }

    public String getSubject(int indexOfSubject){

        return subject[indexOfSubject];
    }

    public  String getSubjectName(String [] subjects){
        String subjectName = "";
        for(int sub = 0; sub < subjects.length; sub++){
            subjectName = subject[sub];
        }
        return subjectName;
    }

    public  void addScore(int indexOfStudent, int indexOfSubject, int score){
        scores[indexOfStudent][indexOfSubject] = score;

    }
    public int getMinimum(int [][] setOfScores){
        int lowestGrade = setOfScores[0][0];
        for (int score = 0; score < setOfScores.length;score++){
            for(int grade = 0; grade < setOfScores.length;grade++){
                if(score <lowestGrade){
                    lowestGrade= score;
                }
            }
        }
        return lowestGrade;


    }

    public int getMaximum(int [][] setOfScores ){
        int highestGrade = setOfScores[0][0];
        for (int score = 0; score < setOfScores.length;score++){
            for(int grade = 0; grade < setOfScores.length;grade++){
                if(score > highestGrade){
                    highestGrade = score;
                }
            }
        }
        return highestGrade;


    }
    public double getAverage(int [] setOfScores){
        double average = 0.0;
        for (int score = 0; score < setOfScores.length;score++){
            average = getTotal(setOfScores) / setOfScores.length;
        }
        return average;

    }

    public void setTotal(double[] total) {
        this.total = total;
    }

    public double getTotal(int[] setOfScores){
        double total =0;
        for(int score = 0;score< setOfScores.length; score++){
             total += score;
        }
        return total;
    }

    public void outputGradeBook(){
        System.out.println("=".repeat(50));
        System.out.printf("%30s%n","GRADE BOOK ");
        System.out.println("=".repeat(50));
        System.out.printf("%s%10s%10s%10s%10s%n","STUDENT",getSubjectName(subject),"TOTAL","AVG","POS");
        System.out.println("=".repeat(50));
        getSummary();


    }
    public void getSummary(){
        System.out.println("SUBJECT SUMMARY");




    }




}
