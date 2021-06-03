public class Divisao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        Integer valorEsquerda = esquerda.avalia();
        Integer valorDireita  = direita.avalia();

        return valorEsquerda / valorDireita;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    @Override
    public void aceita(Visitor impressoraVisitor) {
        impressoraVisitor.visitaDivisao(this);
    }


}
