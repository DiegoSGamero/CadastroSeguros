# Aplicação de Cadastro de Seguros

Este projeto é uma aplicação em Java mvn para cadastro de seguros de vida, imóveis e automóveis. Exercício da disciplina **Linguagem de Programação 2 - Banco de Dados - FATEC** para reforçar o conceito de herança em abstração.

## Funcionalidades

- Cadastro de seguros de vida, imóvel e automóvel.
- Armazenamento dos cadastros em uma coleção `ArrayList`.
- Interface simples em linha de comando (menu interativo) para realizar operações básicas.
- Impressão dos dados dos seguros cadastrados através do método abstrato `imprimirSeguro()`.

## Estrutura do Projeto

### Classes principais

- **Seguro** (classe abstrata)  
  A classe base para os diferentes tipos de seguro.

  Métodos:  
  - Getters e setters para os atributos  
  - Método abstrato `imprimirSeguro(): String` para exibir as informações do seguro  

- **SeguroVida, SeguroImovel, SeguroAuto** (classes concretas)  
  Extendem a classe `Seguro` e implementam o método `imprimirSeguro()` em desenvolvimento.

- **Endereco**  
  Classe de atributo.

- **Data**  
  Classe de atributo.

- **GeradorApolice**  
  Criada além das classes de requisito para que não haja inserção de id pelo usuário.

- **AppPrincipal** (ou similar)  
  Classe principal que contém o loop menu de cadastro em desenvolvimento.


