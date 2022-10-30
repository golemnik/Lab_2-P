package Source.Moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.PARALYZE);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "double team";
    }
}