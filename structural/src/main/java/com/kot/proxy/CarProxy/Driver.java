package com.kot.proxy.CarProxy;

public class Driver {

    private final boolean haveLicense;

    public Driver(boolean haveLicense) {
        this.haveLicense = haveLicense;
    }

    public boolean haveLicense() {
        return haveLicense;
    }
}
