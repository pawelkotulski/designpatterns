package com.kot.proxy.ImageProxy;

public class ProxyImage implements Image {

    private FileImage fileImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public String display() {
        if (isImageLoaded()) {
            fileImage = new FileImage(fileName);
        }

        return fileImage.display();
    }

    public boolean isImageLoaded() {
        return fileImage != null;
    }
}
