import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Answer on 2015-10-03.
 */
public class ControlCenter implements Subject {

    private ArrayList observers;
    private float roomTemp;
    private float waterTemp;

    public ControlCenter() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0)
            observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();

        while(iterator.hasNext())
        {
            Observer observer = (Observer)iterator.next();
            observer.update(roomTemp, waterTemp);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float room, float water)
    {
        this.roomTemp = room;
        this.waterTemp = water;

        measurementsChanged();
    }
}
