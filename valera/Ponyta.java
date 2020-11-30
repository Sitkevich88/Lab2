package valera;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Ponyta extends Pokemon{
    Ponyta(String name, int level){
        super(name, level);
        setStats(50.0D,85.0D,55.0D,65.0D,65.0D,90.0D);
        setType(Type.FIRE); 
        setMove(new DoubleTeam(), new Ember(), new Facade());
    }
}