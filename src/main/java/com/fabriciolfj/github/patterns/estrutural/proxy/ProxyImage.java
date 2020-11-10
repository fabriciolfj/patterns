package com.fabriciolfj.github.patterns.estrutural.proxy;

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
