package Source.Pokemons.WaterType;

import Source.Moves.SpecialMove.FocusBlast;
import ru.ifmo.se.pokemon.Type;

public class Golduck extends Psyduck {
    public Golduck (String name, int Level) {
        super (name, Level);

        setType(Type.WATER);
        setStats(80,52,48,65,50,55);
        addMove(new FocusBlast());
    }
}
