package adventure;

import adventure.behaviors.ComportementArme;

public abstract class Personnage {
    public ComportementArme comportementArme;
    public void setArme(ComportementArme comportementArme){
        this.comportementArme = comportementArme;
    }
    public void combattre() {
        comportementArme.utiliserArme();
    }
}
