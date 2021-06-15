package com.fabriciolfj.github.patterns.v1.estrutural.adapter.interface2;

import com.fabriciolfj.github.patterns.v1.estrutural.adapter.generics.Plug;
import com.fabriciolfj.github.patterns.v1.estrutural.adapter.generics.Tomada;

public class TomadaBrasileira extends Tomada<Plug> {
    @Override
    public String conecta(Plug plugBrasileiro) {
        return plugBrasileiro.obtemEletricidade() + this.getNomeRede();
    }

    @Override
    public String getNomeRede() {
        return "tomada brasileira";
    }
}
