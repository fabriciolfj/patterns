package com.fabriciolfj.github.patterns.comportamental.state;

public class RG extends Documento {

    private Emissao imprimir;
    private Emissao email;

    public RG() {
        this.imprimir = new Imprimir();
        this.email = new Email();
    }

    public void enviarPorEmail() {
        this.email.exec();
    }

    public void imprimir() {
        this.imprimir.exec();
    }

    @Override
    public void setImpressao(Emissao e) {
        imprimir = e;
    }

    @Override
    public void setEmail(Emissao e) {
        email = e;
    }
}
