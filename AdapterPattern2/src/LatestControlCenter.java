import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Answer on 2015-10-09.
 */
public class LatestControlCenter implements LatestSubject {

    private ArrayList observers;
    private float roomTemp;
    private float waterTemp;

    public LatestControlCenter() {
        this.observers = new ArrayList();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void subtractObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0)
            observers.remove(index);
    }

    @Override
    public void alarmObservers() {
        Iterator iterator = observers.iterator();

        while(iterator.hasNext())
        {
            Observer observer = (Observer)iterator.next();
            observer.update(roomTemp, waterTemp);
        }
    }

    @Override
    public void propertiesChanged()
    {
        alarmObservers();
    }

    @Override
    public void setProperties(float room, float water)
    {
        this.roomTemp = room;
        this.waterTemp = water;

        propertiesChanged();
    }
}
