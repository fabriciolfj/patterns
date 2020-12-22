package com.fabriciolfj.github.patterns.comportamental.observer;

public class Main {

    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal();
        nf.setDescricao("Nota fiscal cesta basica");

        Sefaz sefaz = new Sefaz();
        nf.addObserver(sefaz);

        nf.emitir();
        nf.cancelar();
    }
}
