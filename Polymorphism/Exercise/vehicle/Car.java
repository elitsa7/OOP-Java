package vehicle;

public class Car extends Vehicle{
    protected Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        super.setFuelConsumption(fuelConsumption + 0.9);
    }
}
