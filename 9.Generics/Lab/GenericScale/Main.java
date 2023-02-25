package JavaAdvanced.Generics.Lab.GenericScale;

public class Main {
    public static void main(String[] args) {

        Scale<String> stringScale = new Scale<>("a","c");
        Scale<Integer> integerScale = new Scale<>(5,6);
        Scale<Double> doubleScale = new Scale<>(5.6,6.8);
        System.out.println(stringScale.getHeavier());
        System.out.println(integerScale.getHeavier());
        System.out.println(doubleScale.getHeavier());
    }
}
