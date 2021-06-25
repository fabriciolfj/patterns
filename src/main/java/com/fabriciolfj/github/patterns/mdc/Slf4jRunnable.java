package com.fabriciolfj.github.patterns.mdc;

import org.slf4j.MDC;

public class Slf4jRunnable implements Runnable {
    private final Transfer tx;

    public Slf4jRunnable(Transfer tx) {
        this.tx = tx;
    }

    public void run() {
        MDC.put("transaction.id", tx.getTransactionId());
        MDC.put("transaction.send", tx.getSender());
        new Slf4TransferService().transfer(tx.getAmount());
        MDC.clear();
    }
}