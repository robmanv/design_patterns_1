package com.vellasques.builder;

public class Multiplicador implements AcaoAposGerarNota {
    private double fator;

    public Multiplicador(double fator) {
        this.fator = fator;
    }

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("nota impressa multiplicada pelo fator= " +
                this.fator + " valor= " + nf.getValorBruto() * this.fator);
    }
}