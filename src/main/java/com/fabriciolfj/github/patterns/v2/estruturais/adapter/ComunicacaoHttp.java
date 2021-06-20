package com.fabriciolfj.github.patterns.v2.estruturais.adapter;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;

public interface ComunicacaoHttp {

    void execute(final Orcamento orcamento);
}
