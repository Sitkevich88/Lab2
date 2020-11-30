package valera;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

class ShadowSneak extends PhysicalMove{
    public ShadowSneak() {
        super(Type.GHOST, 40.0D, 1.0D, 1, 1);
    }

    @Override
    protected String describe() {
        return "ябедничает";
    }
}