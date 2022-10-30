package Source.Moves.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast () {
        super (Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "use Confusion attack";
    }
}
