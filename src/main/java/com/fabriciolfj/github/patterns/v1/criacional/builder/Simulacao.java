package com.fabriciolfj.github.patterns.v1.criacional.builder;

public class Simulacao {

    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha();
        SanduicheBuilder s1 = new HamburguerBuilder();
        SanduicheBuilder s2 = new FishBuilder();

        cozinha.fazSanduiche(s1);
        s1.getSanduiche();

        cozinha.fazSanduiche(s2);
        s2.getSanduiche();
    }
}
