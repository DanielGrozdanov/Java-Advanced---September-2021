package JavaAdvanced.DefiningClasses.Exercise.PokemonTrainer;

public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Pokemon setName(String name) {
        this.name = name;
        return this;
    }

    public String getElement() {
        return element;
    }


    public void reduceHealth(){
        this.health -=  10;
    }
    public int getHealth() {
        return health;
    }

}
