package valera;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,0.0D,0.0D);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION,1);
    }
    @Override
    protected String describe() {
        return "становится менее уловим на 1";
    }
}