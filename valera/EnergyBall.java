package valera;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

class EnergyBall extends SpecialMove{
    public EnergyBall(){
        super(Type.GRASS,90.0D,1.0D);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.1) p.setMod(Stat.SPECIAL_DEFENSE,-1);
    }
    @Override
    protected String describe() {
        return "имеет 10% вероятность сбить специальную атаку на 1";
    }
}