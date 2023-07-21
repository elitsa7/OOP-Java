package vehicle;

public class Truck extends Vehicle {
    protected Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        super.setFuelConsumption(fuelConsumption + 1.6);
    }
    @Override
    public void refuel(double liters){
        super.refuel(liters * 0.95);
    }
}
