package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void canBeOnTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        assertEquals(true, honda.getPower());

    }

    @Test
    public void canBeOffTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.setPower(false);
        assertEquals(false, honda.getPower());

    }

    @Test
    public void gearOneTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.engageGear(true);
        honda.increaseSpeed(1);
        assertEquals(1, honda.getGearNumber());
        assertEquals(2, honda.getIncrement());

    }

    @Test
    public void gearTwoTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.engageGear(true);
        honda.increaseSpeed(22);
        assertEquals(2, honda.getGearNumber());
        assertEquals(24, honda.getIncrement());

    }

    @Test
    public void gearThreeTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.engageGear(true);
        honda.increaseSpeed(32);
        assertEquals(3, honda.getGearNumber());
        assertEquals(35, honda.getIncrement());
    }

    @Test
    public void gearFourTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.engageGear(true);
        honda.increaseSpeed(44);
        assertEquals(4, honda.getGearNumber());
        assertEquals(48, honda.getIncrement());
    }

    @Test
    public void decelerateTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.engageGear(true);
        honda.increaseSpeed(41);
        honda.decreaseSpeed(41);
        assertEquals(37, honda.getDecrement());

    }
    @Test
    public void decelerateTwoTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.engageGear(true);
        honda.increaseSpeed(37);
        honda.decreaseSpeed(37);
        assertEquals(34, honda.getDecrement());

    }
    @Test
    public void decelerateThreeTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.engageGear(true);
        honda.increaseSpeed(27);
        honda.decreaseSpeed(27);
        assertEquals(25, honda.getDecrement());

    }
    @Test
    public void decelerateFourTest() {
        Bike honda = new Bike();
        honda.setPower(true);
        honda.engageGear(true);
        honda.increaseSpeed(18);
        honda.decreaseSpeed(18);
        assertEquals(17, honda.getDecrement());

    }
}