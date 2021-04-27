package com.vellasques.builder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandPrompt implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("INICIO DA APLICAÇÃO");

        NotaFiscal nf = new NotaFiscalBuilder().paraEmpresa("Caelum")
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
