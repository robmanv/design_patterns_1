package chain_of_responsability.discount_calculator;

public class DiscountCalculator {
    public double calculate(Orcamento orcamento) {
        Discount d1 = new FiveItemsDiscount();
        Discount d2 = new DiscountAboveFiveHundred();
        Discount d3 = new DiscountMarriedSale();
        Discount d4 = new DiscountZero();

        d1.setNextDiscount(d2);
        d2.setNextDiscount(d3);
        d3.setNextDiscount(d4);

        return d1.discount(orcamento);
    }
}
