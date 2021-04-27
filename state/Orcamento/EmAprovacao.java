public class EmAprovacao implements EstadoDeUmOrcamento  {
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!orcamento.descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.05;
            orcamento.descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto já aplicado para o estado EM APROVAÇÃO!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos em aprovação não podem ir direto para finalizado!");

    }
}
