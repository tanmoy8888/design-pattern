package behavioural_design_pattern.observer;

import java.util.Objects;

public class Mobile implements DeviceObserver{
    private int temperature;

    @Override
    public void notifyDevice(int temperature) {
            this.temperature = temperature;
            System.out.println("Mobile temperature ::"+this.temperature);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mobile mobile = (Mobile) o;
        return temperature == mobile.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(temperature);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "temperature=" + temperature +
                '}';
    }
}
