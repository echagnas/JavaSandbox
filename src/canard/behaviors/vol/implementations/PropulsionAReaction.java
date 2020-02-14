package canard.behaviors.vol.implementations;

import canard.behaviors.vol.ComportementVol;

public class PropulsionAReaction implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("Je vole avec un réacteur !");
    }
}
