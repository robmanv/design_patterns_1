package strategy_interfaces.budget;

public class Orcamento {
    private final double valor;

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}