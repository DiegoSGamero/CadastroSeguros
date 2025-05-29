package com.bdfatecdiego.model;

public class SeguroImovel extends Seguro {
    private int deducaoCasa;
    private int anoConstrucao;

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
}
