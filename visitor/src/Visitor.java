public interface Visitor {
    public void visitaSoma(Soma soma);
    public void visitaSubtracao(Subtracao subtracao);
    public void visitaMultiplicacao(Multiplicacao multiplicacao);
    public void visitaDivisao(Divisao divisao);
    public void visitaRaiz(RaizQuadrada raizQuadrada);
    public void visitaNumero(Numero numero);

}
