package com.fabriciolfj.github.patterns.estrutural.decorator;

public class PiscaPisca extends Decoracao {
    public PiscaPisca(Arvore arvore) {
        super(arvore);
    }

    @Override
    public void showEnfeites() {
        super.showEnfeites();
        System.out.println("Pisca-pisca, ");
    }
}
