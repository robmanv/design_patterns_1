// Classe do imposto especifico IKCV
// Extendemos a classe abstrata que implementa a interface imposto
// Na classe ABSTRATA temos a REGRA em comum, AQUI NA CLASSE ESPECIFICA, alimentamos os valores da classe abstrata pra seguir a mesma regra

public class IKCV extends TemplateDeImposto {

    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        for (Item item : orcamento.getItems()) {
            if(item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        if (orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento)) {
            return true;
        } else {
            return false;
        }
    }

    public void calcula() { 
        // mudei a implementação do template aqui
      }
    
}
