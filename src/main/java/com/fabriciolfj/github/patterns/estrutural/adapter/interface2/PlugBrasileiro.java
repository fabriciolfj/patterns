package com.fabriciolfj.github.patterns.estrutural.adapter.interface2;

import com.fabriciolfj.github.patterns.estrutural.adapter.generics.Plug;

public class PlugBrasileiro implements Plug {

    @Override
    public String obtemEletricidade() {
        return "Plug brasileiro conectado à ";
    }
}
