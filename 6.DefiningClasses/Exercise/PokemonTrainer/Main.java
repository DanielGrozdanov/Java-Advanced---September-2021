package JavaAdvanced.DefiningClasses.Exercise.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Trainer> trainerMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Tournament")) {
            String[] info = input.split(" ");
            String trainerName = info[0];
            String pokemonName = info[1];
            String pokemonElement = info[2];
            int pokemonHealth = Integer.parseInt(info[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainerMap.putIfAbsent(trainerName,new Trainer(trainerName,0));
            trainerMap.get(trainerName).getPokemons().add(pokemon);

            input = scanner.nextLine();
        }


        input = scanner.nextLine();
        while (!input.equals("End")) {
            String element = input;
            trainerMap.values().forEach(trainer -> {
                ArrayList<Pokemon> pokemons = trainer.getPokemons();
                boolean hasEl = false;
                for (Pokemon pokemon : pokemons) {
                    if (pokemon.getElement().equals(element)) {
                        hasEl = true;
                        break;
                    }
                }
                checkForElement(trainer,pokemons,hasEl);
                pokemons.removeIf(pokemon -> pokemon.getHealth() <= 0);
            });
            input = scanner.nextLine();
        }

        trainerMap.values().stream().sorted((t1,t2) -> Integer.compare(t2.getBadges(),t1.getBadges())).forEach(System.out::println);
    }

    private static void checkForElement(Trainer trainer, ArrayList<Pokemon> pokemons, boolean hasEl) {
        if (hasEl) {
            trainer.setBadges(trainer.getBadges() + 1);
        } else {
           pokemons.forEach(Pokemon::reduceHealth);
        }
    }
}
