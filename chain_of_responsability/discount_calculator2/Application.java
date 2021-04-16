package chain_of_responsability.discount_calculator2;

public class Application {
    public static void main(String[] args) {
        // =======================
        // CHAIN OF RESPONSABILITY
        // =======================
        //
        // Tenho a classe de serviço, DiscountCalculator
        // --> Retorna o resultado do método discount
        // --> pra cada REGRA de desconto tenho 1 instância e faço o setNextDiscount para linkar a próxima instância
        // --> método discount em cada classe retorna o desconto da instância associada em casa de a regra não atender
        //
        // CLasses DiscountAboveFiveHundred ---> tem instanciado ---> FiveItemsDiscount ---> tem instanciado ---> DiscountZero (toda essa associação faço no serviço DiscountCalculator)
        // =======================
        
        DiscountCalculator discounts = new DiscountCalculator();

        Orcamento orcamento = new Orcamento(501.0);
        orcamento.addItem(new Item("CANETA", 250.0));
        orcamento.addItem(new Item("LAPIS1", 250.0));
        orcamento.addItem(new Item("LAPIS2", 250.0));
        orcamento.addItem(new Item("LAPIS3", 250.0));
        orcamento.addItem(new Item("LAPIS4", 250.0));
        orcamento.addItem(new Item("LAPIS5", 250.0));
        
        double finalDiscount = discounts.calculate(orcamento);
        System.out.println(finalDiscount);
    }
    
}
