package canard.implementations;

import canard.Canard;
import canard.behaviors.cancan.implementations.CanCan;
import canard.behaviors.vol.implementations.VolerAvecDesAiles;

public class Colvert extends Canard {
    public Colvert() {
        comportementCancan = new CanCan();
        comportementVol = new VolerAvecDesAiles();
    }
    public void afficher() {
        System.out.println("Je suis un vrai colvert");
    }
}
