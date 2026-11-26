package behavioural_design_pattern.observer;

public class Mobile implements DeviceObserver{
    private String temperature;

    @Override
    public void notifyDevice(String temperature) {
            this.temperature = temperature;
            System.out.println("Television temperature ::"+this.temperature);
    }
}
