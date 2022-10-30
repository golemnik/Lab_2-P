package Source.Moves.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {

    public BodySlam () {
        super (Type.NORMAL, 85, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().condition(Status.PARALYZE).chance(0.3);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "bodyslams'";
    }
}
