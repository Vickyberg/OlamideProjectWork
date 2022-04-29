package tdd;

public class Kata {
    public int add(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = 0;
        if (firstNumber < secondNumber) difference = secondNumber - firstNumber;
        if (firstNumber > secondNumber) difference = firstNumber - secondNumber;
        return difference;
    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int quotient(int numerator, int denominator) {

        if (denominator == 0) {
            return 0;
        } else {
            return numerator / denominator;
        }
    }

    public int flipper(int anyNumber) {
        int flipper = 0 ;
    if (anyNumber == 1) flipper = 0;
    if (anyNumber == 0) flipper =1;
    return flipper;
    }


    public int exam(int scoreNumber) {
        int result = 0;
        if(scoreNumber >= 90 && scoreNumber <= 100) result = A;
        if(scoreNumber >= 80 && scoreNumber < 90) result  = B;
        if(scoreNumber >= 70 && scoreNumber < 80) result = C;
        if(scoreNumber >= 60 && scoreNumber < 70) result = D;
        if(scoreNumber < 60) result = F;
    return result;
    }

    public int score(int score) {
        int result = 0;
        if(score >= 55) result = PASS;
        if(score < 55)  result = FAIL;
        return result;
    }
}
