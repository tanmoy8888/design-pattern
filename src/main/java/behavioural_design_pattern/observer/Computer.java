package behavioural_design_pattern.observer;

import java.util.Objects;

public class Computer implements DeviceObserver{
    private int temperature;

    @Override
    public void notifyDevice(int temperature) {
            this.temperature = temperature;
            System.out.println("Computer temperature ::"+this.temperature);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return temperature == computer.temperature;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "temperature=" + temperature +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(temperature);
    }

}
