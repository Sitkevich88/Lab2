package valera;

import ru.ifmo.se.pokemon.Battle;

public class Battleground {

    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Spiritomb("Саша",5));
        b.addAlly(new Ponyta("Маша",10));
        b.addAlly(new Rapidash("Катя", 1));
        b.addFoe(new Seedot("Глеб", 1));
        b.addFoe(new Nuzleaf("Паша", 1));
        b.addFoe(new Shiftry("Лёша", 1));
        b.go();
    }
}

