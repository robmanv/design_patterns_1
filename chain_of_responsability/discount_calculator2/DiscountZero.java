package chain_of_responsability.discount_calculator2;

public class DiscountZero implements Discount {

    @Override
    public double discount(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setNextDiscount(Discount nextDiscount) {
    }
    
}
