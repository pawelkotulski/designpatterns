package proxy.CarProxy;

public class RealCar implements Car {
    public void drive(Driver driver) {
        System.out.println("DRIVE");
    }
}
