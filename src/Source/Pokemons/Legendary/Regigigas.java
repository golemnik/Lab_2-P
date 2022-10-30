package Source.Pokemons.Legendary;

import Source.Moves.SpecialMove.Thunder;
import Source.Moves.StatusMove.Confide;
import Source.Moves.StatusMove.DoubleTeam;
import Source.Moves.StatusMove.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Regigigas extends Pokemon {
    public Regigigas (String Name, int Level) {
        super (Name, Level);
        setType(Type.NORMAL);
        setStats(110, 160, 110, 80, 110, 100);
        setMove(new Swagger(), new Confide(), new Thunder(), new DoubleTeam());
    }
}
