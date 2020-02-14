package starbuzz.ingredients;

import starbuzz.Boisson;
import starbuzz.DecorateurIngredient;

public class Chocolat extends DecorateurIngredient {
    private Boisson boisson;
    public Chocolat(Boisson boisson){
        this.boisson= boisson;
    }
    @Override
    public String getDescription() {
        return this.boisson.getDescription()+ ", Chocolat";
    }

    @Override
    public double cout() {
        return .20 + this.boisson.cout();
    }
}
