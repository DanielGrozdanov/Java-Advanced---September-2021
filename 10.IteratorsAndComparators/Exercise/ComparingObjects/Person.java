package JavaAdvanced.IteratorsAndComparators.Exercise.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }


    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getTown() {
        return town;
    }

    public Person setTown(String town) {
        this.town = town;
        return this;
    }

    @Override
    public int compareTo(Person person) {
        if (this.getName().compareTo(person.getName()) == 0) {
            //age, town
            if (this.getAge() == person.getAge()) {
                return this.getTown().compareTo(person.getTown());
            }
            return Integer.compare(this.getAge(), person.getAge());
        }
        return this.getName().compareTo(person.getName());
    }
}
