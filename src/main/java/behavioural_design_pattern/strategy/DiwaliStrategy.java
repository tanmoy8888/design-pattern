package behavioural_design_pattern.strategy;

public class DiwaliStrategy implements DiscountStrategy{
    @Override
    public void calculate() {
        System.out.println("Diwali Strategy applied , 20% instant discount");
    }
}
