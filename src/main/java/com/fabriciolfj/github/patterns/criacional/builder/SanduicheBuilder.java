package com.fabriciolfj.github.patterns.criacional.builder;

public interface SanduicheBuilder {

    void abrePao();
    void insereIngredientes();
    void fechaPao();
    Sanduiche getSanduiche();
}
