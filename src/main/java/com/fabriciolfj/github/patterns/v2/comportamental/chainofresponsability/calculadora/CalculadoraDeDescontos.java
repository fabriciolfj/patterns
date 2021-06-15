package com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.calculadora;

import com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.desconto.OrcamentoAcima5Itens;
import com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.desconto.OrcamentoValorAcima500;
import com.fabriciolfj.github.patterns.v2.comportamental.chainofresponsability.desconto.SemDesconto;
import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(final Orcamento orcamento) {
        var desconto = new OrcamentoAcima5Itens(new OrcamentoValorAcima500(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
