package com.vellasques.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
    private String razaoSocial;
    private String cnpj;
    private Calendar dataDeEmissao;
    private Double valorBruto;
    private double Impostos;
    public List<ItemDaNota> itens;
    public String observacoes;

    public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao, Double valorBruto, double impostos, List<ItemDaNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorBruto = valorBruto;
        Impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Calendar getDataDeEmissao() {
        return dataDeEmissao;
    }

    public Double getValorBruto() {
        return valorBruto;
    }

    public double getImpostos() {
        return Impostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataDeEmissao=" + dataDeEmissao +
                ", valorBruto=" + valorBruto +
                ", Impostos=" + Impostos +
                ", itens=" + itens +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
