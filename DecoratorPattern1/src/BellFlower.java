/**
 * Created by Answer on 2015-10-04.
 */
public class BellFlower extends Ingredient {

    Rice rice;

    public BellFlower(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 도라지";
    }

    @Override
    public int cost() {
        return rice.cost() + 300;
    }
}
