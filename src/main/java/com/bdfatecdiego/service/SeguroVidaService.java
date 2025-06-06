package com.bdfatecdiego.service;

import java.util.ArrayList;
import java.util.List;

import com.bdfatecdiego.model.Data;
import com.bdfatecdiego.model.Endereco;
import com.bdfatecdiego.model.SeguroVida;
import com.bdfatecdiego.utilitarios.GeradorApolice;

public class SeguroVidaService {

    private final ArrayList<SeguroVida> segurosVida = new ArrayList<>();

    // Criar e adicionar na lista
    public SeguroVida criarSeguroVida(String nome, Endereco endereco, float valor,float premio, Data dataNasc, String beneficiario){
        SeguroVida seguroVida = new SeguroVida();
        seguroVida.setNumApolice(GeradorApolice.gerarApolice());
        seguroVida.setNome(nome);
        seguroVida.setEndereco(endereco);
        seguroVida.setValor(valor);
        seguroVida.setPremio(premio);
        seguroVida.setDataNasc(dataNasc);
        seguroVida.setBeneficiario(beneficiario);

        segurosVida.add(seguroVida);

        return seguroVida;
    };

    // Listar
    public List<SeguroVida> listarTodos() {
        return segurosVida;
    };
}
