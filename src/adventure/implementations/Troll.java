package adventure.implementations;

import adventure.Personnage;
import adventure.behaviors.implementations.ComportementHache;

public class Troll extends Personnage {
    public Troll() {
        comportementArme = new ComportementHache();
    }
}
