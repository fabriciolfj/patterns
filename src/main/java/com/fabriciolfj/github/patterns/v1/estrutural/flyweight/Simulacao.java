package com.fabriciolfj.github.patterns.v1.estrutural.flyweight;

public class Simulacao {

    public static void main(String[] args) {
        var figura = FiguraFactory.getFigura(Constantes.CIRCULO_PREENCHIDO);
        figura.desenha("azul");

        var figura2 = FiguraFactory.getFigura(Constantes.CIRUCLO_NPREENCHIDO);
        figura2.desenha("vermelho");

        var figura3 = FiguraFactory.getFigura(Constantes.LINHA);
        figura3.desenha("rosa");
    }
}
