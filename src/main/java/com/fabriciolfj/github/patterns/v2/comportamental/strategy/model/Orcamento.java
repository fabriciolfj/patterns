package com.fabriciolfj.github.patterns.v2.comportamental.strategy.model;

import com.fabriciolfj.github.patterns.v2.comportamental.state.EstadoPedido;
import com.fabriciolfj.github.patterns.v2.comportamental.state.impl.EmAnalise;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Orcamento {

    private BigDecimal valor;
    private Integer qtde;
    private EstadoPedido estadoPedido;

    public Orcamento(final BigDecimal valor, final Integer qtde) {
        this.valor = valor;
        this.qtde = qtde;
        this.estadoPedido = new EmAnalise(this);
        this.estadoPedido.aplicaDesconto();
    }

    public void aprovar() {
        this.estadoPedido.aprovar();
        this.estadoPedido.aplicaDesconto();
    }

    public void reprovar() {
        this.estadoPedido.reprovar();
    }

    public void finalizar() {
        this.estadoPedido.finalizar();
    }
}
