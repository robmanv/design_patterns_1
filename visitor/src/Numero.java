public class Numero implements Expressao {

    private Integer numero;

    public Numero(Integer numero) {
        this.numero = numero;
    }


    @Override
    public int avalia() {
        return numero;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public void aceita(Visitor impressoraVisitor) {
        impressoraVisitor.visitaNumero(this);
    }


}
