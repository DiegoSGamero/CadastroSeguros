package com.bdfatecdiego.app;

import java.util.Scanner;

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

                    break;
                default:
                    System.out.println("Entrada inválida. Encerrando o programa.");
                    scanner.close();
                    return;
            }
        }
        
    }
}
