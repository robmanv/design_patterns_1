package chain_of_responsability;

public interface Discount {
    double discount(Orcamento orcamento);
    void setNextDiscount(Discount nextDiscount);
}
