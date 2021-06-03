public class Numero implements Expressao {

    private Integer numero;

    public Numero(Integer numero) {
        this.numero = numero;
    }


    @Override
    public int avalia() {
        return numero;
    }
}
