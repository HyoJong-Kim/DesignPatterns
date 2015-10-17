/**
 * Created by Answer on 2015-10-04.
 */
public class Simulator {

    public static void main(String args[])
    {
        BroadcastCenter broadcastCenter = new BroadcastCenter();

        Viewer viewer = new Viewer(broadcastCenter);

        broadcastCenter.setProgram("Iron Man2");

        System.out.println("------------------------");

        broadcastCenter.setProgram("The Lord of Ring");
    }
}
