package Source.Pokemons.MagicType;

import Source.Moves.SpecialMove.Flamethrower;
import ru.ifmo.se.pokemon.Type;

public class Clefable extends Clefairy{
    public Clefable (String name, int Level) {
        super (name, Level);

        setType(Type.FAIRY);
        setStats(95,70,73,95,90,60);
        addMove(new Flamethrower());
    }
}
