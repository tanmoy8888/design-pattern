package behavioural_design_pattern.strategy;

public class HoliStrategy implements DiscountStrategy{
    @Override
    public void calculate() {
        System.out.println("Holi Strategy applied");
    }
}
