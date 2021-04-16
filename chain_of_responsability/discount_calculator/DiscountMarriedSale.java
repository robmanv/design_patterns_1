package chain_of_responsability.discount_calculator;

public class DiscountMarriedSale implements Discount {

    Discount nextDiscount;

    @Override
    public double discount(Orcamento orcamento) {

        if (orcamento.contemItemDeNome("LAPIS") || orcamento.contemItemDeNome("CANETA")) {
            double discountedValue = orcamento.getValor();
            discountedValue -= discountedValue * 0.05;
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