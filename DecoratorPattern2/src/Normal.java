/**
 * Created by Answer on 2015-10-04.
 */
public class Normal extends Bicycle {

    public Normal() {
        description = "일반 자전거";
    }

    @Override
    public int cost() {
        return 100000;
    }
}
