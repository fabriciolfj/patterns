package com.fabriciolfj.github.patterns.comportamental.chainofresponsibility;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var comprador = new Comprador();
        var compra = new Compra(BigDecimal.valueOf(4999));

        comprador.aprovar(compra);
    }
}
