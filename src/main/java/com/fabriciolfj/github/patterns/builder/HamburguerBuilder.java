package com.fabriciolfj.github.patterns.builder;

public class HamburguerBuilder implements SanduicheBuilder {

    private Sanduiche s = new Hamburguer();

    @Override
    public void abrePao() {
        System.out.println("Abre pão de hamburguer.");
    }

    @Override
    public void insereIngredientes() {
        System.out.println("Insere carne e queijo");
    }

    @Override
    public void fechaPao() {
        System.out.println("Fecha pão de hamburguer");
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("Hamburguer está pronto !");
        return s;
    }
}
