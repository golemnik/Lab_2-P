package Source.Moves.StatusMove;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, 2);
        p.confuse();
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "double team";
    }
}
