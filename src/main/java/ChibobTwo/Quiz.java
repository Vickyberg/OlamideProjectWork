package ChibobTwo;
/*
prompt the user to enter number of questions
number of questions is given to the user
 user answer the questions
score is given as correct answer - total questions
 */

import java.security.SecureRandom;
import java.util.Scanner;


public class Quiz {
    public static void main(String[] args) {
        Scanner quiz = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        SecureRandom randomOperator  = new SecureRandom();
        int correctAnswer = 0;
        int wrongAnswer = 0;
        int counter = 0;
        int score;

        System.out.print("Enter the number of questions you want: ");
        int userResponse = quiz.nextInt();


        while(counter < userResponse){
            int number1 =  1 + randomNumbers.nextInt(10);
            int number2 = 1 +  randomNumbers.nextInt(10);
            int question =  randomOperator.nextInt(4);
            switch (question){
                case 0: System.out.println("What is " + number1 + " + " + number2 + "?"  );
                    userResponse = quiz.nextInt();

                    if(number1 + number2 == userResponse){
                        correctAnswer++;
                    }else{
                        wrongAnswer++;
                    }
                    continue;
                case 1: System.out.println("What is " + number1 + " - " + number2 + "?");
                userResponse = quiz.nextInt();
                if(number1 - number2 == userResponse){
                    correctAnswer++;
                }else {
                    wrongAnswer++;
                }
                continue;
                case 2: System.out.println("What is " + number1 + " / " +  number2 + "?");
                userResponse = quiz.nextInt();

                if(number1 / number2 == userResponse){
                    correctAnswer++;
                }else {
                    wrongAnswer++;
                }
                continue;
                case 3: System.out.println("What is " + number1 + " % " + number2 + " ? ");
                userResponse = quiz.nextInt();

                if(number1 % number2 == userResponse){
                    correctAnswer++;
                }else {
                    wrongAnswer++;
                }
                continue;
                case 4: System.out.println("What is " + number1 + " * " + number2 + "?");
                userResponse = quiz.nextInt();

                if(number1 * number2 == userResponse){
                    correctAnswer++;
                }else {
                    wrongAnswer++;
                }
                continue;


            }
            counter++;

        }

        score =  correctAnswer - wrongAnswer;

        System.out.println("Correct answer is " + correctAnswer);
        System.out.println("Wrong answer is " + wrongAnswer);
        System.out.println("Your Score is "+ score);



    }
}
