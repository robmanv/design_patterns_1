// Classe do imposto especifico ICPP
// Extendemos a classe abstrata que implementa a interface imposto
// Na classe ABSTRATA temos a REGRA em comum, AQUI NA CLASSE ESPECIFICA, alimentamos os valores da classe abstrata pra seguir a mesma regra
//
// USO PROTECTED nos métodos, para que somente este classe, abaixo da abstrata, consiga implementar as regras. OU SEJA, as regras param por aqui

public class ICPP extends TemplateDeImposto {

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() < 500;
    }



}