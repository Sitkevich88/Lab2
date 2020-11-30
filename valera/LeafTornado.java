package valera;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

class LeafTornado extends SpecialMove{
    public LeafTornado(){
        super(Type.GRASS,65.0D,0.9D);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random()<=0.3) pokemon.setMod(Stat.ACCURACY,-1);
    }
    @Override
    protected String describe() {
        return "вызывает торнадо";
    }
}