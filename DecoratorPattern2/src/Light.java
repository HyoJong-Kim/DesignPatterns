/**
 * Created by Answer on 2015-10-04.
 */
public class Light extends Option {

    Bicycle bicycle;

    public Light(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public String getDescription() {
        return bicycle.getDescription() + " + 전조등";
    }

    @Override
    public int cost() {
        return bicycle.cost() + 20000;
    }
}
