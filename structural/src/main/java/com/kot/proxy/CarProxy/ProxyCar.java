package com.kot.proxy.CarProxy;

public class ProxyCar implements Car {

    public ProxyCar(SimpleCar simpleCar) {
        this.simpleCar = simpleCar;
    }

    private SimpleCar simpleCar;

    public void drive(Driver driver) {
        if(isDriverAllowedToDrive(driver)) {
            simpleCar.drive(driver);
        } else {
            throw new IllegalStateException("Driver have no licence");
        }
    }

    private boolean isDriverAllowedToDrive(Driver driver) {
        return driver.haveLicense();
    }
}
