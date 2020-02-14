package canard.behaviors.vol.implementations;

import canard.behaviors.vol.ComportementVol;

public class NePasVoler implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("Je ne sais pas voler.");
    }
}
