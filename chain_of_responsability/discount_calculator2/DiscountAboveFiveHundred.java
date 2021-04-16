package chain_of_responsability.discount_calculator2;

public class DiscountAboveFiveHundred implements Discount {
    Discount nextDiscount;

    @Override
    public double discount(Orcamento orcamento) {
        if (orcamento.getValor() > 500.0) {
            double discountedValue = orcamento.getValor() - (orcamento.getValor() * 0.07);
            return discountedValue;
        } else {
            return nextDiscount.discount(orcamento);
        }
    }

    @Override
    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
        
    }

    
    
}
