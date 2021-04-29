package com.vellasques.builder;

public class ItemDaNota {
    private String nome;
    private  Double valor;

    public ItemDaNota(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

}
