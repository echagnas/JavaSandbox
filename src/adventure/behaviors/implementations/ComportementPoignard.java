package adventure.behaviors.implementations;

import adventure.behaviors.ComportementArme;

public class ComportementPoignard implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Un coup de poignard");
    }
}
