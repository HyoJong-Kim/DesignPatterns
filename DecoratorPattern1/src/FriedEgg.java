/**
 * Created by Answer on 2015-10-04.
 */
public class FriedEgg extends Ingredient {

    Rice rice;

    public FriedEgg(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + ", 계란프라이";
    }

    @Override
    public int cost() {
        return rice.cost() + 500;
    }
}
