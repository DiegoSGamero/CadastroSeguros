package com.bdfatecdiego.model;

public class Endereco {
    private String enderecoCompleto;
    private String estado;
    private String cidade;
    private String cep;

    public void Endereco() {};

    public void setEnderecoCompleto(String estado, String cidade, String cep) {
        this.enderecoCompleto = cidade + ", " + estado + "-" + cep;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

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

    public String imprimirEndereco() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
