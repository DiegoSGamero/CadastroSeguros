package com.bdfatecdiego.service;

import java.util.ArrayList;
import java.util.List;

import com.bdfatecdiego.model.Endereco;
import com.bdfatecdiego.model.SeguroImovel;

public class SeguroImovelService {

    private ArrayList<SeguroImovel> segurosImovel = new ArrayList<>();

    // Criar e adicionar na lista
    public SeguroImovel criarSeguroImovel(int numApolice, String nome, Endereco endereco, float valor,float premio,int deducaoCasa, int anoConstrucao){
        SeguroImovel seguroImovel = new SeguroImovel();
        seguroImovel.setNumApolice(numApolice);
        seguroImovel.setNome(nome);
        seguroImovel.setEndereco(endereco);
        seguroImovel.setValor(valor);
        seguroImovel.setPremio(premio);
        seguroImovel.setDeducaoCasa(deducaoCasa);
        seguroImovel.setAnoConstrucao(anoConstrucao);

        segurosImovel.add(seguroImovel);

        return seguroImovel;
    };

    // Listar
    public List<SeguroImovel> listarTodos() {
        return segurosImovel;
    };
}
