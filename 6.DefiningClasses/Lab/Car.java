package JavaAdvanced.DefiningClasses.Lab;

import java.security.PublicKey;

public class Car {
    private String make;
    private String model;

    private int horsePower;

    public Car(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;

    }

    public Car(String make, int horsePower) {
        this(make, "unknown", horsePower);
    }


    public Car(String make, String model) {
        this(make, model, -1);
    }

    public Car(String make) {
        this(make, "unknown", -1);
    }


    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.make, this.model, this.horsePower);
    }
}
