/**
 * Created by Answer on 2015-10-04.
 */
public class SpeedMeter extends Option {

    Bicycle bicycle;

    public SpeedMeter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public String getDescription() {
        return bicycle.getDescription() + " + 속도계";
    }

    @Override
    public int cost() {
        return bicycle.cost() + 50000;
    }
}
