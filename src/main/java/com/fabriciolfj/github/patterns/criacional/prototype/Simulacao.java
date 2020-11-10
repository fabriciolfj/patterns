package com.fabriciolfj.github.patterns.criacional.prototype;

public class Simulacao {

    public static void main(String[] args) {
        var lista = new ListaMunicipios();
        var serrana = lista.getMunicipio("Serrana");
        serrana.imprimir();

        var cravinhos = lista.getMunicipio("Cravinhos");
        cravinhos.imprimir();
    }
}
