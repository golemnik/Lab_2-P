package Source.Pokemons.MagicType;

import Source.Moves.PhysicalMove.BodySlam;
import Source.Moves.SpecialMove.Thunder;
import Source.Moves.StatusMove.Rest;
import Source.Moves.StatusMove.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon{
    public Cleffa (String name, int Level) {
        super (name, Level);

        setType(Type.FAIRY);
        setStats(50,25,28,45,55,15);
        setMove(new Rest(), new ThunderWave());
    }

}
