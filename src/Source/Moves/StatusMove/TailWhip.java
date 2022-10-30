package Source.Moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.DEFENSE, -1);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "double team";
    }
}
