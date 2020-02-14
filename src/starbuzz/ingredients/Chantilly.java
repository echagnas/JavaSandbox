package starbuzz.ingredients;

import starbuzz.Boisson;
import starbuzz.DecorateurIngredient;

public class Chantilly extends DecorateurIngredient {
    private Boisson boisson;
    public Chantilly(Boisson boisson) {
        this.boisson = boisson;
    }
    @Override
    public String getDescription() {
        return this.boisson.getDescription()+", Chantilly";
    }

    @Override
    public double cout() {
        return .1 + this.boisson.cout();
    }
}
