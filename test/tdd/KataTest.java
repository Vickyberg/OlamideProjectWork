package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest{
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.add(2,6);
        assertEquals(8,result);
        assertEquals(66,calculator.add(54, 12));

    }
    @Test
    public  void  subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(4,2);
        assertEquals(2,result);
    }
    @Test
    public void  absoluteSubtractionTest(){
        Kata calculator =  new Kata();
        int result = calculator.subtract(2,4);
        assertEquals(2,result);
    }
    @Test
    public void productTest(){
        Kata calculator = new Kata();
        int result = calculator.product(4,2);
        assertEquals(8,result);
    }
    @Test
    public  void quotientTest(){
        Kata calculator = new Kata();
        int result = calculator.quotient(4,2);
        assertEquals(2,result);

    }
    @Test
    public  void divisionByZeroGivesZeroTest(){
        Kata calculator = new Kata();
        int result = calculator.quotient(4,0);
        assertEquals(0,result);

    }
    @Test
    public void bitFlipperTest(){
        Kata calculator = new Kata();
        int result = calculator.flipper(1);
        assertEquals(0,result);
        assertEquals(1,calculator.flipper(0));
    }
    @Test
    public void resultTest(){
        Kata calculator = new Kata();
        int result = calculator.exam(87);
        assertEquals(B,  result);

    }
    @Test
    public  void scoreTest(){
        Kata calculator = new Kata();
        int result = calculator.score(55);
        assertEquals(PASS,result);
    }


}
