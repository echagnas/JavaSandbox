package adventure.implementations;

import adventure.Personnage;
import adventure.behaviors.implementations.ComportementPoignard;

public class Reine extends Personnage {
    public Reine() {
        comportementArme = new ComportementPoignard();
    }
}
