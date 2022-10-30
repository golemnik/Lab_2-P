package Source.Pokemons.MagicType;

import Source.Moves.PhysicalMove.BodySlam;
import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Cleffa{
    public Clefairy (String name, int Level) {
        super (name, Level);

        setType(Type.FAIRY);
        setStats(70,45,48,60,65,35);
        addMove(new BodySlam());
    }
}
