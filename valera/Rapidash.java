package valera;

import ru.ifmo.se.pokemon.Type;

class Rapidash extends Ponyta {
    Rapidash(String name, int level){
        super(name, level);
        setStats(65.0D,100.0D,70.0D,80.0D,80.0D,105.0D);
        setType(Type.FIRE);
        addMove(new FuryAttack());
    }
}