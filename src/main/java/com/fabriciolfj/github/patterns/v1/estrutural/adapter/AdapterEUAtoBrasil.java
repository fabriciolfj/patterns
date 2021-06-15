package com.fabriciolfj.github.patterns.v1.estrutural.adapter;

import com.fabriciolfj.github.patterns.v1.estrutural.adapter.generics.Plug;
import com.fabriciolfj.github.patterns.v1.estrutural.adapter.interface1.PlugAmericano;
import com.fabriciolfj.github.patterns.v1.estrutural.adapter.interface2.TomadaBrasileira;

public class AdapterEUAtoBrasil extends TomadaBrasileira {

    @Override
    public String conecta(Plug plug) {

        if (!(plug instanceof PlugAmericano)) {
            throw new RuntimeException("Plug invalido");
        }

        return plug.obtemEletricidade() + this.getNomeRede();
    }
}
