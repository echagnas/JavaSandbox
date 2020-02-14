package adventure.implementations;

import adventure.Personnage;
import adventure.behaviors.implementations.ComportementEpee;

public class Roi extends Personnage {
    public Roi() {
        comportementArme = new ComportementEpee();
    }
}
