package com.fabriciolfj.github.patterns.v1.comportamental.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class Sefaz implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Status status = (Status) arg;
        NotaFiscal nf = (NotaFiscal) o;

        if (status.equals(Status.EMITIDA)) {
            log.info("Nota fiscal: {}", nf.getDescricao());
            return;
        }

        log.info("Enviando o manifesto de cancelamento {}", nf.getDescricao());
    }
}
