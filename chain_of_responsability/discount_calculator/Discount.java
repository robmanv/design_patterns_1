package chain_of_responsability.discount_calculator;

public interface Discount {
    double discount(Orcamento orcamento);
    void setNextDiscount(Discount nextDiscount);
}
