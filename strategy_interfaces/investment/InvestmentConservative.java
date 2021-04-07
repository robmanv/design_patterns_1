package strategy_interfaces.investment;

import strategy_interfaces.budget.Orcamento;

public class InvestmentConservative implements Investment {

    @Override
    public double investment(Orcamento orcamento) {
        return orcamento.getValor() * 0.08;
    }
}
