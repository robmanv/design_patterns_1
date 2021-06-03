public class RaizQuadrada implements Expressao {
    private Expressao valor;

    public RaizQuadrada(Expressao valor) {
        this.valor = valor;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(valor.avalia());
    }

    public Expressao getValor() {
        return valor;
    }

    @Override
    public void aceita(Visitor impressoraVisitor) {
        impressoraVisitor.visitaRaiz(this);
    }
}
