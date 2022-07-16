package ChapterSeven.StudentResultSystem;

public class GradeBook {


     int [][] gradeBook;

    public GradeBook(int[][] gradeBook) {
        this.gradeBook = gradeBook;
    }
    public int getMinimum(){
        int lowGrade = gradeBook[0][0];
        for(int studentGrade[] : gradeBook){
            for(int grade : studentGrade){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = gradeBook[0][0];
        for (int studentGrades[] : gradeBook){
            for(int grade : studentGrades){
                if (grade > highGrade){
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }
    public double getAverage(int [] setOfGrades){
        int total = 0;
        for (int grade : setOfGrades){
            total += grade;
        }
        return (double) total / setOfGrades.length;

    }
    public double getTotal(int[] setOfGrades){
        int total = 0;
        for (int grade : setOfGrades){
            total += grade;
        }
        return total;
    }
    public int getPosition(int [] average,int student ){
        int position1 = average[0];
        int position2 = average[0];
        int position3 = average[0];
        for(int avg : average){
            if(average[avg] > position1){
                position2 = position3;
                position2 = position1;
                position1 = average[avg];

            }
        }
        int position = 0;
        if(average[student -1] == position1){
            position =1;
        } if (average[student-1]== position2) {
            position =2;

        } if (average[student -1]== position3){
            position3 = 3;
        }
        return position;
    }

    public void outputBook(){

        for(int sub = 0; sub < gradeBook[0].length;sub++ ){
            System.out.printf("%4s%d%2s","SUB", sub + 1,"");
        }
        System.out.printf("%5s%s%s%n","TOT","AVG","POS");

        for(int student= 0;student < gradeBook.length;student++ ){
            System.out.printf("Student %2d", student + 1);
            for(int score : gradeBook[student]){
                System.out.printf("%8d",score);
            }
            double total = getTotal(gradeBook[student]);
            System.out.printf("%9.2f%n",total);
            double average  = getAverage(gradeBook[student]);
            System.out.printf("%9.2f%n",average);

        }


    }



}
