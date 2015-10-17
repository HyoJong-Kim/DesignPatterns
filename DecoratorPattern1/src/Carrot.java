/**
 * Created by Answer on 2015-10-04.
 */
public class Carrot extends Ingredient {

    Rice rice;

    public Carrot(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 당근";
    }

    @Override
    public int cost() {
        return rice.cost() + 200;
    }
}
