package com.bdfatecdiego.model;

public class Endereco {
    private String estado;
    private String cidade;
    private String cep;

    public Endereco() {};
    
    public Endereco(String estado, String cidade, String cep) {
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
    };

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void endCompleto(String cidade, String estado, String cep) {
        String endCompleto;
        endCompleto = cidade + ", " + estado + " - " + cep;
    }

    public String imprimirEndereco() {
        return cidade + ", " + estado + " - " + cep;
    }
}
