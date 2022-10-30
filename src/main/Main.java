package main;

import Source.Pokemons.Legendary.*;
import Source.Pokemons.MagicType.*;
import Source.Pokemons.WaterType.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Regigigas pok1 = new Regigigas ("Biba", 100);
        Golduck pok2 = new Golduck ("Boba", 100);
        Clefable pok3 = new Clefable ("Pupa", 100);
        Cleffa pok4 = new Cleffa ("Lupa", 100);
        Battle bat = new Battle();
        bat.addAlly(pok1); bat.addAlly(pok2);
        bat.addFoe(pok3); bat.addFoe(pok4);
        bat.go();
    }
}