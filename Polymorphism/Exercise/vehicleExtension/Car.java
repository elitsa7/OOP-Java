package vehicle;

public class Car extends Vehicle{
    protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        super.setFuelConsumption(fuelConsumption + 0.9);
    }
}
