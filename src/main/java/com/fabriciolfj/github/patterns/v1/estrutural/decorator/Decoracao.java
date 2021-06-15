package com.fabriciolfj.github.patterns.v1.estrutural.decorator;

public abstract class Decoracao extends Arvore {

    private final Arvore arvore;

    public Decoracao(Arvore arvore) {
        this.arvore = arvore;
    }

    @Override
    public void showEnfeites() {
        arvore.showEnfeites();
    }
}
