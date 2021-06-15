package com.fabriciolfj.github.patterns.v1.comportamental.state;

public class RG extends Documento {

    private Emissao estado;
    private Emissao email;

    public RG() {
        this.estado = new Imprimir();
        this.email = new Email();
    }

    public void enviarPorEmail() {
        this.email.exec();
    }

    public void imprimir() {
        this.estado.exec();
    }

    @Override
    public void setImpressao(Emissao e) {
        estado = e;
    }

    @Override
    public void setEmail(Emissao e) {
        email = e;
    }
}
