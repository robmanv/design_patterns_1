package chain_of_responsability;

public class DiscountAboveFiveHundred implements Discount {

    private Discount nextDiscount;

    public double discount(Orcamento orcamento) {
        if (orcamento.getValor() > 500.0) {
            return orcamento.getValor() * 0.07;
        } else {
            return nextDiscount.discount(orcamento);
        }

    }

    @Override
    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
        
    }
}
