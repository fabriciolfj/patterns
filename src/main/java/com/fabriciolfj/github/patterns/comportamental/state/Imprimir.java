package com.fabriciolfj.github.patterns.comportamental.state;

public class Imprimir extends Emissao {
    @Override
    public void exec() {
        System.out.println("Imprimindo");
    }
}
