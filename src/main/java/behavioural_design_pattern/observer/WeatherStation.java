package behavioural_design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<DeviceObserver> list;
    private int temperature;

    public WeatherStation(){
        this.list = new ArrayList<>();
    }

    public void addDevice(DeviceObserver observer){
        this.list.add(observer);
    }

    public void removeDevice(DeviceObserver observer){
        this.list.remove(observer);
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyAllDevice();
    }
    public void showDevices(){

    }
    private void notifyAllDevice(){
        for (DeviceObserver observer : this.list){
            observer.notifyDevice(this.temperature);
        }
    }
}
