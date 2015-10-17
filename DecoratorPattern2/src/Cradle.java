/**
 * Created by Answer on 2015-10-04.
 */
public class Cradle extends Option {

    Bicycle bicycle;

    public Cradle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public String getDescription() {
        return bicycle.getDescription() + " + 거치대";
    }

    @Override
    public int cost() {
        return bicycle.cost() + 20000;
    }
}
