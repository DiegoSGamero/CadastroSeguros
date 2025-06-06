package com.bdfatecdiego.model;

public class SeguroAuto extends Seguro {
    private int deducaoAutomovel;
    private int numLicenca;
    private String estado;
    private String modelo;
    private int ano;

    public SeguroAuto() {};

    public SeguroAuto(int numApolice, String nome, Endereco endereco, int deducaoAutomovel, int numLicenca, String estado, String modelo, int ano) {
        super (numApolice, nome, endereco, 200f, 0.01f);
        this.deducaoAutomovel = deducaoAutomovel;
        this.numLicenca = numLicenca;
        this.estado = estado;
        this.modelo = modelo;
        this.ano = ano;
    };

    public int getDeducaoAutomovel() {
        return deducaoAutomovel;
    };

    public void setDeducaoAutomovel(int deducaoAutomovel) {
        this.deducaoAutomovel = deducaoAutomovel;
    };

    public int getNumLicenca() {
        return numLicenca;
    };

    public void setNumLicenca(int numLicenca) {
        this.numLicenca = numLicenca;
    };

    public String getEstado() {
        return estado;
    };

    public void setEstado(String estado) {
        this.estado = estado;
    };

    public String getModelo() {
        return modelo;
    };

    public void setModelo(String modelo) {
        this.modelo = modelo;
    };

    public int getAno() {
        return ano;
    };

    public void setAno(int ano) {
        this.ano = ano;
    };

    @Override
    public String imprimirSeguro() {
        return "Seguro Auto - Modelo: " + modelo + ", Ano: " + ano;
    };

    @Override
    public String toString() {
        return "SeguroAuto{" +
                "numApolice=" + numApolice +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", deducaoAutomovel=" + deducaoAutomovel +
                ", numLicenca=" + numLicenca +
                ", estado='" + estado + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
