package com.bdfatecdiego.utilitarios;

public class GeradorApolice {
    private static int contador = 1;

    public static int gerarApolice() {
        return contador++;
    }
}
