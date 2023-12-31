package vehicle;

public class Truck extends Vehicle {
    protected Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        super.setFuelConsumption(fuelConsumption + 1.6);
    }
    @Override
    public void refuel(double liters){
        super.refuel(liters * 0.95);
    }
}
