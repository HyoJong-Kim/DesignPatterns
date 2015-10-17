/**
 * Created by Answer on 2015-10-09.
 */
public class LatestAdapter implements Subject{

    LatestSubject latestSubject;

    public LatestAdapter(LatestSubject latestSubject) {
        this.latestSubject = latestSubject;
    }

    @Override
    public void registerObserver(Observer o) {
        latestSubject.addObserver(o);
    }

    @Override
    public void removeObserver(Observer o) {
        latestSubject.subtractObserver(o);
    }

    @Override
    public void notifyObservers() {
        latestSubject.alarmObservers();
    }

    @Override
    public void setMeasurements(float room, float water)
    {
        latestSubject.setProperties(room, water);
    }

    @Override
    public void measurementsChanged() {
        latestSubject.propertiesChanged();
    }
}
