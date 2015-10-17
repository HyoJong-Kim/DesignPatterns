/**
 * Created by Answer on 2015-10-03.
 */
public class Room implements Observer, DisplayElement {

    private String name;
    private float roomTemp;
    private float waterTemp;

    private Subject controlCenter;

    public Room(Subject controlCenter, String name) {
        this.controlCenter = controlCenter;
        this.name = name;
        controlCenter.registerObserver(this);
    }

    @Override
    public void diplay() {
        System.out.println(name);
        System.out.println(" Room Temperature : " + roomTemp);
        System.out.println("Water Temperature : " + waterTemp);

    }

    @Override
    public void update(float roomTemp, float waterTemp) {
        this.roomTemp = roomTemp;
        this.waterTemp = waterTemp;

        diplay();
    }
}
