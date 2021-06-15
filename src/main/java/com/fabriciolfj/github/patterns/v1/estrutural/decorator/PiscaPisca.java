package com.fabriciolfj.github.patterns.v1.estrutural.decorator;

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
