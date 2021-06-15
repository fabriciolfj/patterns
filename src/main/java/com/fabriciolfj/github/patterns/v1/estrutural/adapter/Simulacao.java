package com.fabriciolfj.github.patterns.v1.estrutural.adapter;

import com.fabriciolfj.github.patterns.v1.estrutural.adapter.interface1.PlugAmericano;

public class Simulacao {

    public static void main(String[] args) {
        AdapterEUAtoBrasil adapterEUAtoBrasil = new AdapterEUAtoBrasil();

        System.out.println(adapterEUAtoBrasil.conecta(new PlugAmericano()));
        //System.out.println(adapterEUAtoBrasil.conecta(new PlugBrasileiro()));
    }
}
