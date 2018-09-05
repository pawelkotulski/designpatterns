package proxy.CarProxy;

public class ProxyCar implements Car {

    public ProxyCar(RealCar realCar) {
        this.realCar = realCar;
    }

    private RealCar realCar;

    public void drive(Driver driver) {
        if(isDriverAllowedToDrive(driver)) {

        } else {
            realCar.drive(driver);
        }
    }

    private boolean isDriverAllowedToDrive(Driver driver) {
        return true;
    }
}
