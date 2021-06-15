package com.fabriciolfj.github.patterns.v1.comportamental.state;

public class Imprimir extends Emissao {
    @Override
    public void exec() {
        System.out.println("Imprimindo");
    }
}
