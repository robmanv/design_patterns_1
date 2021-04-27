public class Orcamento {
    protected double valor;
    protected EstadoDeUmOrcamento estadoAtual;
    protected boolean descontoAplicado;

    public Orcamento(double valor) {
        this.valor = valor;
        estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return this.valor;
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }
}