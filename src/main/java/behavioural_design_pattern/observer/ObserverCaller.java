package behavioural_design_pattern.observer;

public class ObserverCaller {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Computer computer = new Computer();
        station.addDevice(computer);

        station.showDevices();

        Mobile mobile = new Mobile();
        station.addDevice(mobile);

        station.setTemperature(20);
        station.showDevices();

        Television television =  new Television();
        station.addDevice(television);

        station.setTemperature(25);
        station.showDevices();

        station.removeDevice(computer);
        station.setTemperature(15);
        station.showDevices();

    }
}
