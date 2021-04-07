package strategy_interfaces;

import java.util.Locale;

import strategy_interfaces.budget.CalculadorDeImpostos;
import strategy_interfaces.budget.ICCC;
import strategy_interfaces.budget.ICMS;
import strategy_interfaces.budget.ISS;
import strategy_interfaces.budget.Imposto;
import strategy_interfaces.budget.Orcamento;
import strategy_interfaces.investment.Investment;
import strategy_interfaces.investment.InvestmentAggressive;
import strategy_interfaces.investment.InvestmentConservative;
import strategy_interfaces.investment.InvestmentModerate;

public class Aplication {
    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        calculador.realizaCalculo(orcamento, iss);
        calculador.realizaCalculo(orcamento, icms);
        calculador.realizaCalculo(orcamento, iccc);

        Investment conservative = new InvestmentConservative();
        Investment moderate = new InvestmentModerate();
        Investment aggressive = new InvestmentAggressive();

        Locale.setDefault(Locale.US);
        System.out.printf("CONSERVATIVE RETURN = %.2f", conservative.investment(orcamento));
        System.out.println();
        System.out.printf("MODERATE RETURN     = %.2f", moderate.investment(orcamento));
        System.out.println();
        System.out.printf("AGGRESSIVE RETURN   = %.2f", aggressive.investment(orcamento));
        System.out.println();

    }
}
