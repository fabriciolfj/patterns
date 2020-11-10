package com.fabriciolfj.github.patterns.estrutural.decorator;

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
