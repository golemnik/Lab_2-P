package Source.Moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects (Pokemon p) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "confide";
    }
}
