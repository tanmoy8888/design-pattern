package behavioural_design_pattern.strategy;

public class StrategyCaller {
    public static void main(String[] args) {
        DiwaliStrategy diwaliStrategy = new DiwaliStrategy();
        DiscountService discountService = new DiscountService(diwaliStrategy);
    }
}
