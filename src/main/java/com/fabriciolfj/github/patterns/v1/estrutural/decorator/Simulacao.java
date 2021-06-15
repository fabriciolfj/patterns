package com.fabriciolfj.github.patterns.v1.estrutural.decorator;

public class Simulacao {

    public static void main(String[] args) {
        Arvore a = new ArvoreNatal();

        a = new Estrela(a);
        a = new Bola(a);
        a = new PiscaPisca(a);

        a.showEnfeites();

    }
}
