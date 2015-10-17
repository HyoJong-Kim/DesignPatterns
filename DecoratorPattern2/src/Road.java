/**
 * Created by Answer on 2015-10-04.
 */
public class Road extends Bicycle {

    public Road() {
        description = "로드 자전거";
    }

    @Override
    public int cost() {
        return 300000;
    }
}
