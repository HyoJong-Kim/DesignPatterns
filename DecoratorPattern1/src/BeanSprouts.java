/**
 * Created by Answer on 2015-10-04.
 */
public class BeanSprouts extends Ingredient {

    Rice rice;

    public BeanSprouts(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 콩나물";
    }

    @Override
    public int cost() {
        return rice.cost() + 200;
    }
}
