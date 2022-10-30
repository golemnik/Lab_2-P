package Source.Moves.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder () {
        super (Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.PARALYZE).chance(0.3);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "thunder";
    }
}
