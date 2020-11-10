package com.fabriciolfj.github.patterns.builder;

public interface SanduicheBuilder {

    void abrePao();
    void insereIngredientes();
    void fechaPao();
    Sanduiche getSanduiche();
}
