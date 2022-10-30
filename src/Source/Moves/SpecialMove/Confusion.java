package Source.Moves.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {
    public Confusion () {
        super (Type.PSYCHIC, 50, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1);
        if (e.success()) p.confuse();
    }

    @Override
    protected String describe() {
        return "confuse";
    }
}
