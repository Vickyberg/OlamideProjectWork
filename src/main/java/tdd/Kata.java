package tdd;

public class Kata {
    public static int add(int firstNumber, int secondNumber) {

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


    public String exam(int scoreNumber) {
        String result = "0";
        if(scoreNumber >= 90 && scoreNumber <= 100) result = "A";
        if(scoreNumber >= 80 && scoreNumber < 90) result  = "B";
        if(scoreNumber >= 70 && scoreNumber < 80) result = "C";
        if(scoreNumber >= 60 && scoreNumber < 70) result = "D";
        if(scoreNumber < 60) result = "F";
    return result;
    }

    public String score(int score) {
        String result = "0";
        if(score >= 55) result = "PASS";
        if(score < 55)  result = "FAIL";
        return result;
    }


    public double BMICalculator(double weight, double height) {
        double onePound = 0.45359237;
        double oneInch = 0.0254;
        System.out.println("Enter weight in pound: " + weight);
        System.out.println("Enter height in inches: " + height);
         double poundsToKilogram = weight * onePound;
         double inchesToMeters = height * oneInch;

         double BMI = poundsToKilogram / (inchesToMeters * inchesToMeters);
         System.out.printf("BMI is " + BMI);
         return BMI;



    }

    public double financialApplication(int balance, double InterestRate, int constant) {
        double interest = balance * (InterestRate/ 1200 );
        return interest ;
    }



    public static int noOfFactors(int num) {
        int factors = 0 ;
        int i = 1;
        for(i = 1 ; i<= num;i++){
            if(num % i == 0)
                factors++;

        }
        return factors;

    }

    public boolean isPrime(int num) {
        if(noOfFactors(num) == 2) return true;
        return false;
    }
}
