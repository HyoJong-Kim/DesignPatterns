/**
 * Created by Answer on 2015-10-03.
 */
public class Simulator {

    public static void main(String args[])
    {
        ControlCenter controlCenter = new ControlCenter();
        Room room1 = new Room(controlCenter, "A101");
        Room room2 = new Room(controlCenter, "B201");

        controlCenter.setMeasurements(27, 30);

        System.out.println("\n---------------------------");

        controlCenter.setMeasurements(17, 10);

        LatestSubject latestControlCenter = new LatestControlCenter();
        LatestAdapter latestAdapter = new LatestAdapter(latestControlCenter);

        Room room3 = new Room(latestAdapter, "C101");

        latestAdapter.setMeasurements(50, 100);
    }
}
