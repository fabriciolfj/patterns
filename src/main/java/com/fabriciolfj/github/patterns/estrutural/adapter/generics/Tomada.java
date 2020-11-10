package com.fabriciolfj.github.patterns.estrutural.adapter.generics;

public abstract class Tomada<P> {

    public abstract String conecta(P p);
    public abstract String getNomeRede();
}
