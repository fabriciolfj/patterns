package com.fabriciolfj.github.patterns.v1.criacional.prototype;

import java.util.Hashtable;

public class ListaMunicipios {

    private static Hashtable<String, Municipio> municipios = new Hashtable<>(); //sincronizada, ideal para concorrência

    public ListaMunicipios() {
        var serrana = new Serrana();
        municipios.put("Serrana", serrana);

        var cravinhos = new Cravinhos();
        municipios.put("Cravinhos", cravinhos);
    }

    public Municipio getMunicipio(final String descricao) {
        return municipios.get(descricao).clone();
    }
}
