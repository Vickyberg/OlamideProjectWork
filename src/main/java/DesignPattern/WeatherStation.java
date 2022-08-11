package DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private int temperature;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void remove(Observer observer) {


    }

    @Override
    public void alert() {

        for(Observer observer : observers){
            observer.update();
        }

    }


     public void setTemperature(int temperature){
        this.temperature = temperature;
     }
    public int getTemperature() {
        return temperature;
    }
}
