package canard.implementations;

import canard.Canard;
import canard.behaviors.cancan.implementations.CanCan;
import canard.behaviors.vol.implementations.NePasVoler;

public class PrototypeCanard extends Canard {
    public PrototypeCanard() {
        comportementVol = new NePasVoler();
        comportementCancan = new CanCan();
    }
    @Override
    public void afficher() {
        System.out.println("Je suis un proto-canard.");
    }
}
