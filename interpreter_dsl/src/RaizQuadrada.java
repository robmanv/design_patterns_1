public class RaizQuadrada implements Expressao {
    private Expressao valor;

    public RaizQuadrada(Expressao valor) {
        this.valor = valor;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(valor.avalia());
    }
}
