package valera;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

class Pound extends PhysicalMove{
    public Pound(){
        super(Type.NORMAL,40.0D,1.0D);
    }
    @Override
    protected String describe() {
        return "становится сильнее";
    }
}