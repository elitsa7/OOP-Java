package vehicle;

import java.text.DecimalFormat;

public abstract class Vehicle implements VehicleImpl {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String drive(double distance){
        double neededFuel = this.getFuelConsumption() * distance;
        if (neededFuel > this.fuelQuantity){
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.fuelQuantity -= neededFuel;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
    }

    @Override
    public void refuel (double liters){
        if (liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        double quantity = this.fuelQuantity + liters;
        if (quantity > this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }

}
