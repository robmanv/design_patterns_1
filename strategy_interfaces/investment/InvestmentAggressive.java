package strategy_interfaces.investment;

import strategy_interfaces.budget.Orcamento;

public class InvestmentAggressive implements Investment {

    @Override
    public double investment(Orcamento orcamento) {
        if (new java.util.Random().nextDouble() < 0.20) {
            return orcamento.getValor() * 0.05;
        }
        if (new java.util.Random().nextDouble() < 0.30) {
            return orcamento.getValor() * 0.03;
        }
        if (new java.util.Random().nextDouble() < 0.50) {
            return orcamento.getValor() * 0.06;
        }

        return 0;
    }

}
