package chain_of_responsability.discount_calculator2;

public interface Discount {
    double discount(Orcamento orcamento);
    void setNextDiscount(Discount nextDiscount);
}
