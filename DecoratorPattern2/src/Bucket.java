/**
 * Created by Answer on 2015-10-04.
 */
public class Bucket extends Option {

    Bicycle bicycle;

    public Bucket(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public String getDescription() {
        return bicycle.getDescription() + " + 바구니";
    }

    @Override
    public int cost() {
        return bicycle.cost() + 20000;
    }
}
