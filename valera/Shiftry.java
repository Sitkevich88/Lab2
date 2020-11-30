package valera;

import ru.ifmo.se.pokemon.Type;

class Shiftry extends Nuzleaf {
    Shiftry(String name, int level){
        super(name, level);
        setStats(90.0D,100.0D,60.0D,90.0D,60.0D,80.0D);
        setType(Type.GRASS,Type.DARK);
        addMove(new LeafTornado());
    }
}