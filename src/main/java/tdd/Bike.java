package tdd;

public class Bike {
    private boolean power;
    private int speed;
    private int dSpeed;
    private boolean gear;
    private int gearNumber;
    private int increment;
    private int decrement;

    public void setPower(boolean func) {
        power = func;
    }

    public boolean getPower() {
        return power;
    }

    public void engageGear(boolean type) {
        gear = type;
    }

    public int getSpeed() {
        return speed;


    }

    public void increaseSpeed(int speed) {
        this.speed = speed;
        if(speed >= 0 && speed <= 20){
            gearNumber = 1;
        }
        if(speed > 20 && speed <= 30 ){
            gearNumber = 2;
        }
        if(speed > 30 && speed <= 40 ){
            gearNumber = 3;
        }
        if(speed > 40  ){
            gearNumber = 4;
        }
    }

    public int getGearNumber() {
        if(gearNumber == 1){
            increment = speed + 1;
        }
        if(gearNumber == 2){
            increment = speed + 2;
        }
        if(gearNumber == 3){
            increment = speed + 3;
        }
        if(gearNumber == 4){
            increment = speed + 4;
        }

        return gearNumber;
    }

    public int getIncrement() {

        return increment;
    }

    public void decreaseSpeed(int dSpeed) {
        if(dSpeed > 40){
            gearNumber = 4;
        }
        if(dSpeed >30 && dSpeed <= 40){
         gearNumber = 3;
        }
        if(dSpeed >20 && dSpeed <= 30){
            gearNumber = 2;
        }
        if(dSpeed >0 && dSpeed <= 20){
            gearNumber = 1;
        }
        this.dSpeed = dSpeed;
    }

    public int getDecrement() {
        if (gearNumber == 3) {
            decrement = dSpeed - 3;
        }
        if (gearNumber == 4) {
            decrement = dSpeed - 4;
        }
        if (gearNumber == 2) {
            decrement = dSpeed - 2;
        }
        if (gearNumber == 1){
            decrement = dSpeed-1;
        }
        return decrement;
    }
}
