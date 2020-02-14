package adventure.behaviors.implementations;

import adventure.behaviors.ComportementArme;

public class ComportementArcEtFleches implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Tir de flêches");
    }
}
