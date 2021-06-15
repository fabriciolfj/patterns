package com.fabriciolfj.github.patterns.v1.estrutural.proxy;

public class ProxyImage extends Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.displayImage();
    }
}
