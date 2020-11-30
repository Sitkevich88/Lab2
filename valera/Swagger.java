package valera;

import ru.ifmo.se.pokemon.*;

class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL,0.0D,0.85D);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
    @Override
    protected String describe() {
        return "увеличивает атаку врагу на 2 и сбивает его с толку";
    }
}