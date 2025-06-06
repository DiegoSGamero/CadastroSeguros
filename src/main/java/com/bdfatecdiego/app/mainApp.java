package com.bdfatecdiego.app;

import java.util.Scanner;

import com.bdfatecdiego.model.Endereco;
import com.bdfatecdiego.model.SeguroAuto;
import com.bdfatecdiego.service.SeguroAutomovelService;
import com.bdfatecdiego.utilitarios.GeradorApolice;

public class mainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Olá, você está no Seguros FATEC");
            System.out.println("Aqui estão os valores e prêmios para seguros de vida, imóvel ou auto:");
            System.out.println("Seguro de vida: valor de R$ 100,00 e prêmio de 0,3% ao mês");
            System.out.println("Seguro de imóvel: valor de R$ 150,00 e prêmio de 0,2% ao mês");
            System.out.println("Seguro de automóvel: valor de R$ 200,00 e prêmio de 0,1% ao mês");
            System.out.println("Para cadastrar digite vida, imóvel ou auto");
            System.out.println("Para sair, digite qualquer outra coisa");

            String produto = scanner.nextLine().trim().toLowerCase();

            switch (produto) {
                case "vida":
                    System.out.println("Cadastro de seguro de vida");
                    break;
                case "imóvel":
                case "imovel":
                    System.out.println("Cadastro de seguro de imóvel");
                    
                    break;
                case "auto":
                    System.out.println("Cadastro de seguro de automóvel");
                    int numApolice = GeradorApolice.gerarApolice();
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Cidade: ");
                    String cidade = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Estado: ");
                    String estado = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Cep: ");
                    String cep = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Deducao estimada: ");
                    String deducao = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Numero da licença: ");
                    String licenca = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Carro zero ou usado? ");
                    String estadoAuto = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Modelo: ");
                    String modelo = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Ano: ");
                    String ano = scanner.nextLine().trim().toLowerCase();
                    Endereco endAuto = new Endereco(cidade, estado, cep);
                    int deducaoAuto = Integer.parseInt(deducao);
                    int numLicenca = Integer.parseInt(licenca);
                    int anoAuto = Integer.parseInt(ano);
                    SeguroAutomovelService autoService = new SeguroAutomovelService();
                    SeguroAuto novoSeguro = autoService.criarSeguroAuto(nome, endAuto, deducaoAuto, numLicenca, estadoAuto, modelo, anoAuto);
                    System.out.println("Seguro criado com sucesso:");
                    System.out.println(novoSeguro.toString());
                    // System.out.println(segurosAuto.size());
                    break;
                default:
                    System.out.println("Entrada inválida. Encerrando o programa.");
                    scanner.close();
                    return;
            }
        }
        
    }
}
