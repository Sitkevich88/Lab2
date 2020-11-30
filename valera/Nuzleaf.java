package valera;

import ru.ifmo.se.pokemon.Type;

class Nuzleaf extends Seedot {
    Nuzleaf(String name, int level){
        super(name, level);
        setStats(70.0D,70.0D,40.0D,60.0D,40.0D,60.0D);
        setType(Type.GRASS,Type.DARK);
        addMove(new Pound());
    }
}

