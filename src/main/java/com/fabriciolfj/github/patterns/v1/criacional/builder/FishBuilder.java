package com.fabriciolfj.github.patterns.v1.criacional.builder;

public class FishBuilder implements SanduicheBuilder {

    private Sanduiche s = new Fishburguer();

    @Override
    public void abrePao() {
        System.out.println("Abre pão de fishburger");
    }

    @Override
    public void insereIngredientes() {
        System.out.println("Insere filé de peixe.");
    }

    @Override
    public void fechaPao() {
        System.out.println("Fecha pão de fishburguer.");
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("Fishburguer está pronto !");
        return s;
    }
}
