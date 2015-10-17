import java.util.Observable;
import java.util.Observer;

/**
 * Created by Answer on 2015-10-04.
 */
public class Viewer implements Observer {

    private Observable observable;
    private String program;

    public Viewer(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof BroadcastCenter)
        {
            BroadcastCenter broadcastCenter = (BroadcastCenter)o;
            this.program = broadcastCenter.getProgram();
            display();
        }
    }

    public void display()
    {
        System.out.println("Now BroadCasting : " + program);
    }
}
