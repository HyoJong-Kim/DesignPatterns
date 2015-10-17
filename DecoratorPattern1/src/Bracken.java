/**
 * Created by Answer on 2015-10-04.
 */
public class Bracken extends Ingredient {

    Rice rice;

    public Bracken(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 고사리";
    }

    @Override
    public int cost() {
        return rice.cost() + 200;
    }
}
