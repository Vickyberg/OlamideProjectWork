package DesignPattern;

public class PhoneDisplay  implements Observer{

    private  WeatherStation station;

    public PhoneDisplay(WeatherStation station){
        this.station = station;
    }

    @Override
    public void update() {

        this.station.getTemperature();

    }
}
