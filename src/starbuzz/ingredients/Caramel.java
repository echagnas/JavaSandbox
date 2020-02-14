package starbuzz.ingredients;

import starbuzz.Boisson;
import starbuzz.DecorateurIngredient;

public class Caramel extends DecorateurIngredient {
    private Boisson boisson;
    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }
    @Override
    public String getDescription() {
        return this.boisson.getDescription()+", Caramel";
    }

    @Override
    public double cout() {
        return 0.15 + this.boisson.cout();
    }
}
