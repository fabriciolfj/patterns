package com.fabriciolfj.github.patterns.v1.comportamental.mediator;

import java.util.HashSet;
import java.util.Set;

public class MediatorImpl extends Mediator {

    private AvaliadorCredito avaliadorCredito;
    public Set<Pessoa> pessoas;

    public MediatorImpl() {
        this.avaliadorCredito = new AvaliadorCredito();
        this.pessoas = new HashSet<>();
    }

    @Override
    public void avaliar() {
        this.pessoas.forEach(avaliadorCredito::executar);
    }

    public void registrarPessoa(final Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
}
