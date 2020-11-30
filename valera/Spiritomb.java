package valera;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

class Spiritomb extends Pokemon {
    Spiritomb(String name, int level) {
        super(name, level);
        setStats(50.0D, 92.0D, 108.0D, 92.0D, 108.0D, 35.0D);
        setType(Type.GHOST, Type.DARK);
        setMove(new ShadowSneak(),new Confide(), new FoulPlay(), new Swagger());
    }
}