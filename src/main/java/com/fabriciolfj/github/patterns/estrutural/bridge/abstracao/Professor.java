package com.fabriciolfj.github.patterns.estrutural.bridge.abstracao;

public abstract class Professor {

    private Implementacao implementacao;

    public Professor(final Implementacao implementacao) {
        this.implementacao = implementacao;
    }

    public void execute() {
        implementacao.operacao();
    }
}
