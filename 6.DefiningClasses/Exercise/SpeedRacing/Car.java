package JavaAdvanced.DefiningClasses.Exercise.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double consumption;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distanceTraveled = 0;
    }

    public boolean drive(double kilometersToDrive) {
        double fuelNeeded = kilometersToDrive * consumption;
        if (fuelNeeded > fuelAmount) {
            return false;
        }
        this.fuelAmount -= fuelNeeded;
        this.distanceTraveled += kilometersToDrive;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
