package dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public List<Car> carList;
    public String name;
    public int capacity;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.carList = new ArrayList<>();
    }

    public void add(Car car) {
        if (carList.size() < capacity) {
            carList.add(car);
        }
    }


    public boolean buy(String manufacturer, String model) {
        for (Car car : carList) {
            if (car.manufacturer.equals(manufacturer) && car.model.equals(model)) {
                carList.remove(car);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        return carList.get(0);
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car : carList) {
            if (car.manufacturer.equals(manufacturer) && car.model.equals(model)) {
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return carList.size();
    }


    public String getStatistics() {
        StringBuilder builder = new StringBuilder();
        builder.append("The cars are in a car dealership ").append(this.name).append(":").append(System.lineSeparator());
        for (Car car : carList) {
            builder.append(car).append(System.lineSeparator());
        }

        return builder.toString().trim();
    }
}
