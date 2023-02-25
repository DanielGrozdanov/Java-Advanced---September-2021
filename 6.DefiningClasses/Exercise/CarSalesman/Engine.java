package JavaAdvanced.DefiningClasses.Exercise.CarSalesman;

public class Engine {

    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this(model, power, 0, "n/a");
    }

    public Engine(String model, int power, int displacement) {
        this(model, power, displacement, "n/a");
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power, 0, efficiency);
    }

    @Override
    public String toString() {
        String displacementPrint;
        if (displacement == 0) {
            displacementPrint = "n/a";
        } else {
            displacementPrint = this.displacement + "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(model).append(":").append(System.lineSeparator())
                .append("Power: ").append(power).append(System.lineSeparator())
                .append("Displacement: ").append(displacementPrint).append(System.lineSeparator())
                .append("Efficiency: ").append(efficiency);
        return builder.toString();
    }
}
