package com.fabriciolfj.github.patterns.estrutural.decorator;

public class Estrela extends Decoracao {
    public Estrela(Arvore arvore) {
        super(arvore);
    }

    @Override
    public void showEnfeites() {
        super.showEnfeites();
        System.out.println("Estrela, ");
    }
}
