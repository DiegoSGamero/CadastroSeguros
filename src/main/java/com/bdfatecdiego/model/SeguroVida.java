package com.bdfatecdiego.model;

public class SeguroVida extends Seguro {
    private Data dataNasc;
    private String beneficiario;

    public SeguroVida() {};

    public SeguroVida(int numApolice, String nome, Endereco endereco, Data dataNasc, String beneficiario) {
        super (numApolice, nome, endereco, 100f, 0.03f);
        this.dataNasc = dataNasc;
        this.beneficiario = beneficiario;
    };

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    };

    public Data getDataNasc() {
        return dataNasc;
    };

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    };

    public String getBeneficiaro () {
        return beneficiario;
    };

    @Override
    public String imprimirSeguro() {
        return "Seguro de Vida - Beneficiario: " + beneficiario + ", Data de Nascimento: " + dataNasc;
    }
}
