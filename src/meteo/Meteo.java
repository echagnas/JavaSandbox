package meteo;

import java.util.Observable;

public class Meteo extends Observable {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.setChanged();
        this.notifyObservers(temperature);
    }
}
