package com.fabriciolfj.github.patterns.v2.estruturais.adapter.http;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import com.fabriciolfj.github.patterns.v2.estruturais.adapter.ComunicacaoHttp;

public class HttpAdapter implements ComunicacaoHttp {

    @Override
    public void execute(Orcamento orcamento) {
        System.out.println("Request: " + orcamento.toString());
    }
}
