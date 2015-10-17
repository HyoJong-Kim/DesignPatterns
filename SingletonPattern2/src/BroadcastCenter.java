import java.util.Observable;

/**
 * Created by Answer on 2015-10-04.
 */
public class BroadcastCenter extends Observable {

    private volatile static BroadcastCenter uniqueInstance;
    private String program;

    public static BroadcastCenter getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (BroadcastCenter.class)
            {
                if(uniqueInstance == null)
                    uniqueInstance = new BroadcastCenter();
            }
        }

        return uniqueInstance;
    }

    private BroadcastCenter() {
    }

    public void programChanged()
    {
        setChanged();
        notifyObservers();
    }

    public void setProgram(String name)
    {
        this.program = name;
        programChanged();
    }

    public String getProgram()
    {
        return program;
    }
}
