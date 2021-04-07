package strategy_interfaces.investment;

import strategy_interfaces.budget.Orcamento;

public class InvestmentModerate implements Investment {

    @Override
    public double investment(Orcamento orcamento) {
        if (new java.util.Random().nextDouble() < 0.50) {
            return orcamento.getValor() * 0.025;
        } else {
            return orcamento.getValor() * 0.07;
        }
    }
    
}
