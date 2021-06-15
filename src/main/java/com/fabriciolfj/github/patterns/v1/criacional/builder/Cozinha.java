package com.fabriciolfj.github.patterns.v1.criacional.builder;

public class Cozinha {

    public void fazSanduiche(final SanduicheBuilder builder) {
        builder.abrePao();
        builder.insereIngredientes();
        builder.fechaPao();
    }
}
