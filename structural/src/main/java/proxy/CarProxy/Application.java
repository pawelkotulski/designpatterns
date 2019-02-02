package proxy.CarProxy;

public class Application {

    public static void main(String ... a) {
        Driver notLicensedDriver = new Driver(false);

        SimpleCar simpleCar = new SimpleCar();
        ProxyCar protectedCar = new ProxyCar(simpleCar);

        simpleCar.drive(notLicensedDriver);
        protectedCar.drive(notLicensedDriver);
    }
}
