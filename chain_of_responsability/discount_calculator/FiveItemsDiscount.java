package chain_of_responsability.discount_calculator;

public class FiveItemsDiscount implements Discount {

    private Discount nextDiscount;

    public double discount(Orcamento orcamento) {
        if (orcamento.getItems().size() > 5) {
            return orcamento.getValor() * 0.1;
        } else {
            return nextDiscount.discount(orcamento);
        }
    }
    @Override
    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

}
