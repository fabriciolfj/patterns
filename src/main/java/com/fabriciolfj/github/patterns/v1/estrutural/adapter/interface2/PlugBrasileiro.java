package com.fabriciolfj.github.patterns.v1.estrutural.adapter.interface2;

import com.fabriciolfj.github.patterns.v1.estrutural.adapter.generics.Plug;

public class PlugBrasileiro implements Plug {

    @Override
    public String obtemEletricidade() {
        return "Plug brasileiro conectado à ";
    }
}
