package com.bdfatecdiego.service;

import java.util.ArrayList;
import java.util.List;

import com.bdfatecdiego.model.Endereco;
import com.bdfatecdiego.model.SeguroAuto;
import com.bdfatecdiego.utilitarios.GeradorApolice;;

public class SeguroAutomovelService {
    
    private ArrayList<SeguroAuto> segurosAuto = new ArrayList<>();

    // Criar e adicionar na lista
    public SeguroAuto criarSeguroAuto(String nome, Endereco endereco, float valor,float premio, int deducaoAutomovel, int numLicenca, String estado, String modelo, int ano) {
        SeguroAuto seguroAuto = new SeguroAuto();
        seguroAuto.setNumApolice(GeradorApolice.gerarNumero());
        seguroAuto.setNome(nome);
        seguroAuto.setEndereco(endereco);
        seguroAuto.setValor(valor);
        seguroAuto.setPremio(premio);
        seguroAuto.setDeducaoAutomovel(deducaoAutomovel);
        seguroAuto.setNumLicenca(numLicenca);
        seguroAuto.setEstado(estado);
        seguroAuto.setModelo(modelo);
        seguroAuto.setAno(ano);

        segurosAuto.add(seguroAuto);
        return seguroAuto;
    };

    // Listar
    public List<SeguroAuto> listarTodos() {
        return segurosAuto;
    };

    // Buscar pelo n da apólice(id convencionado)
    public SeguroAuto buscarPorNumApolice(int numApolice) {
        for (SeguroAuto seguroAuto : segurosAuto) {
            if (seguroAuto.getNumApolice() == numApolice) {
                return seguroAuto;
            }
        }
        return null;
    };

    // Excluir pelo n da apólice
    public boolean excluirPorNumApolice(int numApolice) {
        return segurosAuto.removeIf(seguro -> seguro.getNumApolice() == numApolice);
    };
}
