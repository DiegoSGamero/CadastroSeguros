package com.bdfatecdiego.model;

import com.bdfatecdiego.utilitarios.GeradorApolice;

public abstract class Seguro {
    
    protected int numApolice; // id
    protected String nome;
    protected Endereco endereco;
    protected float valor;
    protected float premio;

    public Seguro() {};

    public Seguro(int numApolice, String nome, Endereco endereco, float valor, float premio) {
        this.numApolice = GeradorApolice.gerarApolice();
        this.nome= nome;
        this.endereco = endereco;
        this.valor = valor;
        this.premio = premio;
    };

    public void setNumApolice(int numApolice) {
        this.numApolice = numApolice;
    };

    public int getNumApolice() {
        return numApolice;
    };

    public void setNome(String nome) {
        this.nome= nome;
    };

    public String getNome() {
        return nome;
    };

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    };

    public Endereco getEndereco() {
        return endereco;
    };

    public void setValor(float valor) {
        this.valor = valor;
    };

    public float getValor() {
        return valor;
    };

    public void setPremio(float premio) {
        this.premio = premio;
    };

    public float getPremio() {
        return premio;
    };

    public abstract String imprimirSeguro();
}
