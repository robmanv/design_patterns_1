public class ImpressoraPreVisitor implements Visitor {
    public void visitaSoma(Soma soma) {
        System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        System.out.print(" ");
        soma.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        System.out.print(" ");
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaMultiplicacao(Multiplicacao multiplicacao) {
        System.out.print(" * ");
        System.out.print("(");
        multiplicacao.getEsquerda().aceita(this);
        System.out.print(" ");
        multiplicacao.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaDivisao(Divisao divisao) {
        System.out.print(" ");
        System.out.print("(");
        divisao.getEsquerda().aceita(this);
        System.out.print(" ");
        divisao.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaRaiz(RaizQuadrada raizQuadrada) {
        System.out.print("Raiz de ");
        System.out.print("(");
        raizQuadrada.getValor().aceita(this);
        System.out.print(")");
    }

    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());
    }

}
