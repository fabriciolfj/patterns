package com.fabriciolfj.github.patterns.estrutural.adapter.interface1;

import com.fabriciolfj.github.patterns.estrutural.adapter.generics.Plug;

public class PlugAmericano implements Plug {

    @Override
    public String obtemEletricidade() {
        return "Plug americano conectado a ";
    }
}
