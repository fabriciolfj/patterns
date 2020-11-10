package com.fabriciolfj.github.patterns.criacional.prototype;

public abstract class Municipio implements Cloneable {

    public Municipio clone() {
        try {
            return (Municipio) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public abstract void imprimir();
}
