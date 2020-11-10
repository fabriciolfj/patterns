package com.fabriciolfj.github.patterns.estrutural.adapter;

import com.fabriciolfj.github.patterns.estrutural.adapter.generics.Plug;
import com.fabriciolfj.github.patterns.estrutural.adapter.interface1.PlugAmericano;
import com.fabriciolfj.github.patterns.estrutural.adapter.interface2.TomadaBrasileira;

public class AdapterEUAtoBrasil extends TomadaBrasileira {

    @Override
    public String conecta(Plug plug) {

        if (!(plug instanceof PlugAmericano)) {
            throw new RuntimeException("Plug invalido");
        }

        return plug.obtemEletricidade() + this.getNomeRede();
    }
}
