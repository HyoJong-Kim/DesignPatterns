/**
 * Created by Answer on 2015-10-04.
 */
public class Cucumber extends Ingredient {

    Rice rice;

    public Cucumber(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 오이";
    }

    @Override
    public int cost() {
        return rice.cost() + 500;
    }
}
