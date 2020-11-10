package com.fabriciolfj.github.patterns.estrutural.proxy;

public class RealImage extends Image {

    private String fileName;

    public RealImage(final String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + fileName);
    }
}
