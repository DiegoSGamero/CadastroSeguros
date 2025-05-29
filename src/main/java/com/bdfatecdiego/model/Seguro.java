package com.bdfatecdiego.model;

public abstract class Seguro {
    private int numApolice;
    private String nome;
    private Endereco endereco;
    private float valor;
    private float premio;

    public void Seguro() {};

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
        return numApolice;
    };

    public void setPremio(float premio) {
        this.premio = premio;
    };

    public float getPremio() {
        return premio;
    };
}
