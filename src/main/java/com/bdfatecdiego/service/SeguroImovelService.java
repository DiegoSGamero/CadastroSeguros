package com.bdfatecdiego.service;

import java.util.ArrayList;
import java.util.List;

import com.bdfatecdiego.model.Endereco;
import com.bdfatecdiego.model.SeguroImovel;
import com.bdfatecdiego.utilitarios.GeradorApolice;

public class SeguroImovelService {

    private ArrayList<SeguroImovel> segurosImovel = new ArrayList<>();

    // Criar e adicionar na lista
    public SeguroImovel criarSeguroImovel(String nome, Endereco endereco, float valor,float premio,int deducaoCasa, int anoConstrucao){
        SeguroImovel seguroImovel = new SeguroImovel();
        seguroImovel.setNumApolice(GeradorApolice.gerarNumero());
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
