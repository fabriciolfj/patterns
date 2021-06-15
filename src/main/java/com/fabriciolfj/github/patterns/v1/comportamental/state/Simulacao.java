package com.fabriciolfj.github.patterns.v1.comportamental.state;

public class Simulacao {

    public static void main(String[] args) {
        final var rg = new RG();
        rg.enviarPorEmail();
        rg.imprimir();

        rg.setImpressao(new Cancelar());
        rg.imprimir();
    }
}
