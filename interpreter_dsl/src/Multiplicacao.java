public class Multiplicacao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        Integer valorEsquerda = esquerda.avalia();
        Integer valorDireita  = direita.avalia();

        return valorEsquerda * valorDireita;
    }
}
