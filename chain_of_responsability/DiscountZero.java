package chain_of_responsability;

public class DiscountZero implements Discount {

    @Override
    public double discount(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setNextDiscount(Discount nextDiscount) {
    }
    
}
