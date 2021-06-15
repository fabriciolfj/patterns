package com.fabriciolfj.github.patterns.v1.comportamental.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;

@Getter
@Setter
public class NotaFiscal extends Observable {

    private String descricao;
    private Status status;

    public void emitir() {
        setChanged();
        notifyObservers(Status.EMITIDA);
    }

    public void cancelar() {
        setChanged();
        notifyObservers(Status.CANCELADA);
    }
}
