package com.fabriciolfj.github.patterns.estrutural.decorator;

public class ArvoreNatal extends Arvore {

    public ArvoreNatal() {

    }

    public ArvoreNatal(Arvore arvore) {
        super();
    }

    @Override
    public void showEnfeites() {
        System.out.println("Árvore de natal, ");
    }
}
