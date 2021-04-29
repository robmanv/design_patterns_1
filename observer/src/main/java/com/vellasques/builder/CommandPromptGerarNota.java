package com.vellasques.builder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandPromptGerarNota implements CommandLineRunner {

    // OBSERVER
    // ========
    //
    // Na classe NotaFiscalBuilder:
    // - Incluido INTERFACE AcaoAposGerarNota X CLASSES Impressora, EnviadorDeSms, NotaFiscalDao, EnviadorDeEmail com método em comum executa, por exemplo.
    // - Incluído LISTA<AcaoAposGerarNota> vazia no construtor
    // - Incluido MÉTODO pra adicionar na LISTA<AcaoAposGerarNota>, pra adicionar os OBSERVERS
    // - Incluido no MÉTODO BUILD da classe NotaFiscalBuilder um FOREACH, para executar o AcoesAposGerarNota.executa(nf), acionando o OBSERVER

    @Override
    public void run(String... args) throws Exception {
        System.out.println("INICIO DA APLICAÇÃO 2");

        NotaFiscalBuilder nfb = new NotaFiscalBuilder();
        nfb.adicionaAcao(new EnviadorDeEmail());
        nfb.adicionaAcao(new NotaFiscalDao());
        nfb.adicionaAcao(new EnviadorDeSms());
        nfb.adicionaAcao(new Impressora());
        nfb.adicionaAcao(new Multiplicador(5.0));

        NotaFiscal nf = nfb.paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .com(new ItemDaNota("item 1", 200.0))
                .com(new ItemDaNota("item 2", 300.0))
                .com(new ItemDaNota("item 3", 400.0))
                .comObservacoes("entregar nf pessoalmente")
                /* Opcional
                .naData(new GregorianCalendar())
                */
                .build();

        System.out.println(nf.getValorBruto());
        System.out.println(nf);

    }
}

