package valera;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

class FoulPlay extends PhysicalMove{
    public FoulPlay(){
        super(Type.DARK, 95.0D,1.0D);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, 0);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe() {
        return "хитрит";
    }
}