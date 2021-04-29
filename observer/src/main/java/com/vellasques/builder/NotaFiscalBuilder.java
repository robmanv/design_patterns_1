package com.vellasques.builder;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
class NotaFiscalBuilder {

	// ========
	// BUILDER:
	// ========
	// - Especificar todos os atributos da ENTIDADE
	// - Cada SET de atributo, retorno a própria classe (NotaFiscalBuilder) pra fazer o METHOD CHAIN
	// - E no final chamo o build que é o CONSTRUTOR REAL
	//
	// OBSERVAÇÃO: OTIMO PRA NÃO TER QUE GERAR N COMBINAÇÕES DE CONSTRUTORES, CASO TENHA ATRIBUTOS OPCIONAIS

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private String observacoes;
	private Calendar data;

	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	public NotaFiscalBuilder() {

	    this.data = Calendar.getInstance();
	    this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();

	} // Caso de ATRIBUTO OPCIONAL, já inicializo

    public void adicionaAcao(AcaoAposGerarNota acaoAposGerarNota) {
	    this.todasAcoesASeremExecutadas.add(acaoAposGerarNota);
    }


	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;

		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;

		return this;
	}

	public NotaFiscalBuilder com(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;

		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;

		return this;
	}

	public NotaFiscalBuilder naData(Calendar novaData) {
		this.data = novaData;

		return this;
	}

	public NotaFiscal build() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos,
				todosItens, observacoes);

        for (AcaoAposGerarNota acoesAposGerarNota: todasAcoesASeremExecutadas) {
            acoesAposGerarNota.executa(nf);
        }

// Substitui o trecho abaixo que gera alto acoplamento, exigindo manutenções futuras desta classe
//		new EnviadorDeEmail().enviaPorEmail(nf);
//		new NotaFiscalDao().salvaNoBanco(nf);
//		new EnviadorDeSms().enviaPorSms(nf);
//		new Impressora().imprime(nf);

		return nf;
	}








}