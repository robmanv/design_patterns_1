package chain_of_responsability.discount_calculator2;

public class DiscountAboveFiveItems implements Discount {

    private Discount nextDiscount;

    public double discount(Orcamento orcamento) {
        if (orcamento.getItems().size() > 5) {
            double discountValue = orcamento.getValor() - (orcamento.getValor() * 0.1);
            return discountValue;
        } else {
            return nextDiscount.discount(orcamento);
        }
    }

    @Override
    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
        
    }

    
}
