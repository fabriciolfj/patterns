package com.fabriciolfj.github.patterns.v1.estrutural.adapter.interface1;

import com.fabriciolfj.github.patterns.v1.estrutural.adapter.generics.Tomada;

public class TomadaAmericana extends Tomada<PlugAmericano> {

    @Override
    public String conecta(PlugAmericano plugAmericano) {
        return plugAmericano.obtemEletricidade() + this.getNomeRede();
    }

    @Override
    public String getNomeRede() {
        return "tomada americana";
    }
}
