package com.fabriciolfj.github.patterns.estrutural.decorator;

public class Bola extends Decoracao {
    public Bola(Arvore arvore) {
        super(arvore);
    }

    @Override
    public void showEnfeites() {
        super.showEnfeites();
        System.out.println("Bola, ");
    }
}
