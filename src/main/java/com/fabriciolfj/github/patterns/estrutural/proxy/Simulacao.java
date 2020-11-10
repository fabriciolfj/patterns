package com.fabriciolfj.github.patterns.estrutural.proxy;

public class Simulacao {

    public static void main(String[] args) {
        RealImage realImage = new RealImage("Teste1");
        ProxyImage proxy = new ProxyImage("teste2");

        proxy.displayImage();
    }
}
