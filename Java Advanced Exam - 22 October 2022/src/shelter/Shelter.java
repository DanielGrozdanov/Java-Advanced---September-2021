package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private List<Animal> animals;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public void add(Animal animal) {
        if (animals.size() < capacity) {
            animals.add(animal);
        }
    }

    public boolean remove(String name) {
        return animals.removeIf(animal -> animal.getName().equals(name));
    }

    public Animal getAnimal(String name, String caretaker) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)) {
                return animal;
            }
        }
        return null;
    }

    public Animal getOldestAnimal() {
        return animals.stream().max(Comparator.comparingInt(Animal::getAge)).get();
    }

    public int getCount() {
        return this.animals.size();
    }

    public String getStatistics() {
        StringBuilder builder = new StringBuilder();
        builder.append("The shelter has the following animals: ").append(System.lineSeparator());
        for (Animal animal : animals) {
            builder.append(animal.getName()).append(" ").append(animal.getCaretaker()).append(System.lineSeparator());
        }

        return builder.toString().trim();
    }
}
