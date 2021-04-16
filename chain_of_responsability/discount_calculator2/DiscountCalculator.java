package chain_of_responsability.discount_calculator2;

public class DiscountCalculator {

    public double calculate(Orcamento orcamento) {
        Discount d2 = new DiscountAboveFiveHundred();
        Discount d1 = new DiscountAboveFiveItems();
        Discount d3 = new DiscountZero();

        d1.setNextDiscount(d2);
        d2.setNextDiscount(d3);

        return d1.discount(orcamento);

    }
}
