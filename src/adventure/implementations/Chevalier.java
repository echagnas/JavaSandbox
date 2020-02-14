package adventure.implementations;

import adventure.Personnage;
import adventure.behaviors.implementations.ComportementArcEtFleches;

public class Chevalier extends Personnage {
    public Chevalier() {
        comportementArme = new ComportementArcEtFleches();
    }
}
