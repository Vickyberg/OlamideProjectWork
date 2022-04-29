package tdd;

public class AirConditioner {
    private boolean power;
    private int temperature;

    public void setPower(boolean powerOn) {
        power = powerOn;
    }

    public boolean getPower() {
        return power;
    }

    public void setTemperature(int temp) {
        temperature = temp;
        if(temperature > 30){
            temperature = 30;
        }
        if(temperature < 16){
            temperature =  16;
        }
    }

    public int getTemperature() {
        return temperature;
    }
}
