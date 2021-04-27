public class Aprovado implements EstadoDeUmOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!orcamento.descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.02;
            orcamento.descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto já aplicado para o estado APROVADO!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está aprovado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
