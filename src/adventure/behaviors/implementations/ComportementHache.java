package adventure.behaviors.implementations;

import adventure.behaviors.ComportementArme;

public class ComportementHache implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Un coup de hache");
    }
}
