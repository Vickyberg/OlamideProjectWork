package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void additionTest() {
        Kata calculator = new Kata();
        int result = calculator.add(2, 6);
        assertEquals(8, result);
        assertEquals(66, calculator.add(54, 12));

    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 4);
        assertEquals(2, result);
    }

    @Test
    public void productTest() {
        Kata calculator = new Kata();
        int result = calculator.product(4, 2);
        assertEquals(8, result);
    }

    @Test
    public void quotientTest() {
        Kata calculator = new Kata();
        int result = calculator.quotient(4, 2);
        assertEquals(2, result);

    }

    @Test
    public void divisionByZeroGivesZeroTest() {
        Kata calculator = new Kata();
        int result = calculator.quotient(4, 0);
        assertEquals(0, result);

    }

    @Test
    public void bitFlipperTest() {
        Kata calculator = new Kata();
        int result = calculator.flipper(1);
        assertEquals(0, result);
        assertEquals(1, calculator.flipper(0));
    }

    @Test
    public void resultTest() {
        Kata calculator = new Kata();
        String result = calculator.exam(87);
        assertEquals("B", result);
        assertEquals("A", calculator.exam(99));

    }

    @Test
    public void scoreTest() {
        Kata calculator = new Kata();
        String result = calculator.score(55);
        assertEquals("PASS", result);
    }

    @Test
    public void scoreTwoTest() {
        Kata calculator = new Kata();
        String result = calculator.score(30);
        assertEquals("FAIL", result);

    }
    @Test
    public  void BMITest(){
        Kata calculator = new Kata();
        double BMI = calculator.BMICalculator(95.5 ,50);
        assertEquals(26.857257942215885,BMI);
    }
    @Test
    public  void  interestTest(){
        Kata calculator = new Kata();
        double interest =  calculator.financialApplication(1000,3.5,1200);
        assertEquals(2.916666666666667,interest);

    }
    @Test
    public  void factorsTest(){
        Kata calc = new Kata();
        int factors = Kata.noOfFactors(5);
                assertEquals(2, factors);
                assertEquals(4,Kata.noOfFactors(10));
        assertEquals(6, Kata.noOfFactors(20));
    }
    @Test
    public  void primeNumberTest(){
        Kata calc = new Kata();
        boolean isPrime = calc.isPrime(5);
        assertTrue(isPrime);

    }
    @Test
    public void hypotenuseTest(){
        Kata calc = new Kata();
        double hypotenuse = calc.hypotenuse(3.0,4.0);
        assertEquals(5.0,hypotenuse);
        assertEquals(13.0,calc.hypotenuse(5.0,12.0));
        assertEquals(17.0,calc.hypotenuse(8.0,15.0));

    }
@Test
    public  void parkingCharges(){
        Kata calc = new Kata();
        double charges = calc.calculateCharges(3);
        assertEquals(2.0,charges);
        assertEquals(3.0,calc.calculateCharges(5));

}
}

