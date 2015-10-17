/**
 * Created by Answer on 2015-10-04.
 */
public class Beef extends  Ingredient {
    Rice rice;

    public Beef(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 소고기";
    }

    @Override
    public int cost() {
        return rice.cost() + 700;
    }
}
