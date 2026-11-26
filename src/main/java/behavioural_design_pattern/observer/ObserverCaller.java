package behavioural_design_pattern.observer;

public class ObserverCaller {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        station.addDevice();
    }
}
