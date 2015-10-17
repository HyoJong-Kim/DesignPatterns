/**
 * Created by Answer on 2015-10-04.
 */
public class Mushroom extends Ingredient {

    Rice rice;

    public Mushroom(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 버섯";
    }

    @Override
    public int cost() {
        return rice.cost() + 300;
    }
}
