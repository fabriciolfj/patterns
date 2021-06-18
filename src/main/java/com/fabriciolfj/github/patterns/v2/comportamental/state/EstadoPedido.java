package com.fabriciolfj.github.patterns.v2.comportamental.state;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class EstadoPedido {

    protected final Orcamento orcamento;

    public void aplicaDesconto() {
        throw new RuntimeException("Desconto nao pode ser aplicado");
    };

    public void aprovar() {
        throw new RuntimeException("Orçamento nao pode ser aprovado");
    };

    public void reprovar() {
        throw new RuntimeException("Orçamento nao pode ser reprovado");
    };

    public void finalizar() {
        throw new RuntimeException("Orçamento não pode ser finalizado");
    }
}
