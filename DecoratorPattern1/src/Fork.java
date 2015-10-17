/**
 * Created by Answer on 2015-10-04.
 */
public class Fork extends Ingredient {

    Rice rice;

    public Fork(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 돼지고기";
    }

    @Override
    public int cost() {
        return rice.cost() + 600;
    }
}
