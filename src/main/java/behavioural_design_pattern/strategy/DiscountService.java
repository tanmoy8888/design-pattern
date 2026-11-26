package behavioural_design_pattern.strategy;

public class DiscountService {
    private DiscountStrategy discountStrategy;

    public DiscountService(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }

    public void applyStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }
}
