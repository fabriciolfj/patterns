package com.fabriciolfj.github.patterns.v2.estruturais.adapter;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegistroOrcamento {

    private final ComunicacaoHttp comunicacaoHttp;

    public void envioOrcamento(final Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new RuntimeException("Orçamento não encontra-se finalizado para envio");
        }

        comunicacaoHttp.execute(orcamento);
    }
}
