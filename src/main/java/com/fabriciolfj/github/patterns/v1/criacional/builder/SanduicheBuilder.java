package com.fabriciolfj.github.patterns.v1.criacional.builder;

public interface SanduicheBuilder {

    void abrePao();
    void insereIngredientes();
    void fechaPao();
    Sanduiche getSanduiche();
}
