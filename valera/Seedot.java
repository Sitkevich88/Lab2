package valera;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Seedot extends Pokemon{
    Seedot(String name, int level){
        super(name, level);
        setStats(40.0D,40.0D,50.0D,30.0D,30.0D,30.0D);
        setType(Type.GRASS);
        setMove(new EnergyBall(),new DoubleTeam());
    }
}