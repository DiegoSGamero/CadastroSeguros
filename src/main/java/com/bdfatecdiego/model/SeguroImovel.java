package com.bdfatecdiego.model;

public class SeguroImovel extends Seguro {
    private int deducaoCasa;
    private int anoConstrucao;

    public SeguroImovel() {};

    public SeguroImovel(int numApolice, String nome, Endereco endereco, int deducaoCasa, int anoConstrucao) {
        super (numApolice, nome, endereco, 150f, 0.02f);
        this.deducaoCasa = deducaoCasa;
        this.anoConstrucao = anoConstrucao;
    };

    public void setDeducaoCasa (int deducaoCasa) {
        this.deducaoCasa = deducaoCasa;
    };

    public int getDeducaoCasa () {
        return deducaoCasa;
    };

    public void setAnoConstrucao (int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    };

    public int getAnoConstrucao () {
        return anoConstrucao;
    };

    @Override
    public String imprimirSeguro() {
        return "Seguro de Imóvel - Dedução: " + deducaoCasa + ", Ano de Construção: " + anoConstrucao;
    }
}
