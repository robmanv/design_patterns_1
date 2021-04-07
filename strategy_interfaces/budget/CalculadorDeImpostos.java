package strategy_interfaces.budget;

public class CalculadorDeImpostos {
    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        System.out.println(imposto.calcula(orcamento));
    }
}
