package com.kot.proxy.ImageProxy;

public class FileImage implements Image {

    public FileImage(String fileName) {
        loadFromDisc(fileName);
    }

    private void loadFromDisc(String fileName) {
        System.out.println("Loaded " + fileName);
    }

    public String display() {
        return "DISC IMAGE";
    }
}
