package com.vellasques.builder;

public class EnviadorDeSms  implements AcaoAposGerarNota {
    public void executa(NotaFiscal nf) {
        System.out.println("enviei por sms");
    }
}
