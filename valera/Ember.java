package valera;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

class Ember extends SpecialMove{
    public Ember(){
        super(Type.FIRE,40.0D,1.0D);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.1) Effect.burn(p);
    }
    @Override
    protected String describe() {
        return "имеет 10% вероятность поджечь";
    }
}

