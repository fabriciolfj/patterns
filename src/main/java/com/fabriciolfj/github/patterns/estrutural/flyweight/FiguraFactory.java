package com.fabriciolfj.github.patterns.estrutural.flyweight;

import java.util.Hashtable;

import static com.fabriciolfj.github.patterns.estrutural.flyweight.Constantes.*;
import static java.util.Optional.ofNullable;

public class FiguraFactory {

    private static final Hashtable<String, Figura> figuras = new Hashtable<>();

    public static Figura getFigura(final String nome) {
        return ofNullable(figuras.get(nome))
                .orElse(addFigura(nome));
    }

    private static Figura addFigura(String nome) {
        Figura figura = null;
        switch (nome) {
            case CIRCULO_PREENCHIDO:
                figura =  new Circulo(true);
                figuras.put(nome, figura);
                return figura;
            case CIRUCLO_NPREENCHIDO:
                figura = new Circulo(false);
                figuras.put(nome, figura);
                return figura;
            case LINHA:
                figura = new Linha();
                figuras.put(nome, figura);
                return figura;
            default:
                throw new RuntimeException("Nenhuma figura localizada");
        }
    }
}
