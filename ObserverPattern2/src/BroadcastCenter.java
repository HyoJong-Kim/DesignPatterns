import java.util.Observable;

/**
 * Created by Answer on 2015-10-04.
 */
public class BroadcastCenter extends Observable {

    private String program;

    public BroadcastCenter() {
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
