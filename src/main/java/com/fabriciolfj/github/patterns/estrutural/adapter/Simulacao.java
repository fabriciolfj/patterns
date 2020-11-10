package com.fabriciolfj.github.patterns.estrutural.adapter;

import com.fabriciolfj.github.patterns.estrutural.adapter.interface1.PlugAmericano;
import com.fabriciolfj.github.patterns.estrutural.adapter.interface2.PlugBrasileiro;

public class Simulacao {

    public static void main(String[] args) {
        AdapterEUAtoBrasil adapterEUAtoBrasil = new AdapterEUAtoBrasil();

        System.out.println(adapterEUAtoBrasil.conecta(new PlugAmericano()));
        //System.out.println(adapterEUAtoBrasil.conecta(new PlugBrasileiro()));
    }
}
