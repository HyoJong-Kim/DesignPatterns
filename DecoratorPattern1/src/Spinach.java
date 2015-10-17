/**
 * Created by Answer on 2015-10-04.
 */
public class Spinach extends Ingredient {

    Rice rice;

    public Spinach(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 시금치";
    }

    @Override
    public int cost() {
        return rice.cost() + 200;
    }
}
