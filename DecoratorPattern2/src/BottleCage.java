/**
 * Created by Answer on 2015-10-04.
 */
public class BottleCage extends Option {

    Bicycle bicycle;

    public BottleCage(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public String getDescription() {
        return bicycle.getDescription() + " + 케이지";
    }

    @Override
    public int cost() {
        return bicycle.cost() + 20000;
    }
}
