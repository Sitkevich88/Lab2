package valera;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

class FuryAttack extends PhysicalMove{
    private static int hitsAmount(){
        int probability = (int)(Math.random() * 8);
        int hits;
        switch (probability) {
            case 3:
            case 4:
            case 5:
                hits = 3;
                break;
            case 6:
                hits = 4;
                break;
            case 7:
                hits = 5;
                break;
            default:
                hits = 2;
                break;
        }
        return hits;
    }
    public FuryAttack(){
        super(Type.NORMAL,15.0D,0.85D,0,hitsAmount());
    }
    @Override
    protected String describe() {
        return "наносит много ударов";
    }
}