package adventure.behaviors.implementations;

import adventure.behaviors.ComportementArme;

public class ComportementEpee implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Un coup d'épée");
    }
}
