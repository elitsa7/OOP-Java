package vehicle;

import java.text.DecimalFormat;

public abstract class Vehicle implements VehicleImpl {
    private double fuelQuantity;
    private double fuelConsumption;

    protected Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public String drive(double distance){
        double neededFuel = this.fuelConsumption * distance;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = String.format("%s needs refueling", this.getClass().getSimpleName());
        if (this.fuelQuantity >= neededFuel){
            result = String.format("%s travelled %s km", this.getClass().getSimpleName(),
                decimalFormat.format(distance));

            this.fuelQuantity -= neededFuel;
        }


        return result;
    }
    @Override
    public void refuel (double liters){
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
