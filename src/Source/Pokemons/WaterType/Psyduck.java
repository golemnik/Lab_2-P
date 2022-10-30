package Source.Pokemons.WaterType;

import Source.Moves.SpecialMove.Confusion;
import Source.Moves.StatusMove.Confide;
import Source.Moves.StatusMove.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Psyduck extends Pokemon{
    public Psyduck (String name, int Level) {
        super (name, Level);

        setType(Type.WATER);
        setStats(50,52,48,65,50,55);
        setMove(new Confusion(), new Confide(), new TailWhip());
    }
}
