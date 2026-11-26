package behavioural_design_pattern.observer;

import java.util.Objects;

public class Television implements DeviceObserver{
    private int temperature;

    @Override
    public void notifyDevice(int temperature) {
            this.temperature = temperature;
            System.out.println("Television temperature ::"+this.temperature);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return temperature == that.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(temperature);
    }

    @Override
    public String toString() {
        return "Television{" +
                "temperature=" + temperature +
                '}';
    }
}
