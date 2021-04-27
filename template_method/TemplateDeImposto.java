// TEMPLATE METHOD
// ---------------
//
// Temos a estrutura: INTERFACE -> ABSTRACT -> CLASS
//
// No caso do imposto temos a Interface com as assinaturas de métodos pra gerar o desacoplamento
// No caso da classe ABSTRATA, implementamos as regras em comum a serem adotadas em cada CLASSE de imposto específico
// Observamos assim, quais as regras em COMUM, regra para TAXACAO MINIMA ou MAXIMA
// Nas classes filhas implementamos os valores e critérios para cada REGRA (imposto minimo e imposto maximo)

// colocando o FINAL no método CALCULA evito que as FILHAS ALTEREM ESSA REGRA


public abstract class TemplateDeImposto implements Imposto {

    @Override
    public final double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);



    
}
