package valera;

import ru.ifmo.se.pokemon.*;

class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL,70.0D,1.0D);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        Status k = p.getCondition();
        if (k.equals(Status.BURN)||k.equals(Status.POISON)||k.equals(Status.PARALYZE)){
            p.setMod(Stat.HP, (int)damage * 2);
        }
    }
    @Override
    protected String describe() {
        return "хитрит";
    }
}

