package com.fabriciolfj.github.patterns.v2.estruturais.adapter;

import com.fabriciolfj.github.patterns.v2.comportamental.strategy.model.Orcamento;
import com.fabriciolfj.github.patterns.v2.estruturais.adapter.http.HttpAdapter;

import java.math.BigDecimal;

public class Simulacao {

    public static void main(String[] args) {
        final var orcamento = new Orcamento(BigDecimal.TEN, 17);
        orcamento.aprovar();
        orcamento.finalizar();

        var registro = new RegistroOrcamento(new HttpAdapter());
        registro.envioOrcamento(orcamento);
    }
}
