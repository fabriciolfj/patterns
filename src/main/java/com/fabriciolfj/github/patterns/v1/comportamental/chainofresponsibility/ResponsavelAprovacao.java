package com.fabriciolfj.github.patterns.v1.comportamental.chainofresponsibility;

public abstract class ResponsavelAprovacao {

    protected ResponsavelAprovacao sucessor;

    public abstract void aprovar(Compra compra);
}
