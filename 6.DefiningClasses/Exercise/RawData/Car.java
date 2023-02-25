package JavaAdvanced.DefiningClasses.Exercise.RawData;

import java.util.ArrayList;

public class Car {
    private String model;
    private int engineSpeed;
    private int enginePower;
    private int cargoWeight;
    private String cargoType;
    private ArrayList<Tyre> tyres;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType, ArrayList<Tyre> tyres) {
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tyres = tyres;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public int getEnginePower() {
        return enginePower;
    }
    public String getCargoType() {
        return cargoType;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
