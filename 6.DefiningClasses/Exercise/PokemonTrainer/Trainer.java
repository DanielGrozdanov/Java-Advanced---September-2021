package JavaAdvanced.DefiningClasses.Exercise.PokemonTrainer;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private int badges;
    private ArrayList<Pokemon> pokemons;

    public Trainer(String name, int badges) {
        this.name = name;
        this.badges = badges;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Trainer setName(String name) {
        this.name = name;
        return this;
    }

    public int getBadges() {
        return badges;
    }

    public Trainer setBadges(int badges) {
        this.badges = badges;
        return this;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public Trainer setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.badges , this.pokemons.size());
    }
}
