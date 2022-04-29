package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void canBeOnTest(){
        AirConditioner samsung = new AirConditioner();

        samsung.setPower(true);

        assertEquals(true, samsung.getPower());
    }

    @Test
    public void canBeOffTest() {
        AirConditioner samsung = new AirConditioner();

        samsung.setPower(true);
        samsung.setPower(false);

        assertEquals(false, samsung.getPower());
    }
    @Test
    public  void increaseTest(){
        AirConditioner samsung = new AirConditioner();
        samsung.setPower(true);
        samsung.setTemperature(16);
        samsung.setTemperature(17);
        assertEquals(17,samsung.getTemperature());

    }
    @Test
    public  void decreaseTest(){
        AirConditioner samsung = new AirConditioner();
        samsung.setPower(true);
        samsung.setTemperature(17);
        samsung.setTemperature(16);
        assertEquals(16,samsung.getTemperature());

    }
    @Test
    public void upperLimitTest(){
        AirConditioner samsung = new AirConditioner();
        samsung.setPower(true);
        samsung.setTemperature(33);
        assertEquals(30,samsung.getTemperature());
    }
    @Test
    public void lowerLimitTest() {
        AirConditioner samsung = new AirConditioner();
        samsung.setPower(true);
        samsung.setTemperature(15);
        assertEquals(16, samsung.getTemperature());

    }

}
