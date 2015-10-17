/**
 * Created by Answer on 2015-10-09.
 */
public interface LatestSubject {

    public void addObserver(Observer o);
    public void subtractObserver(Observer o);
    public void alarmObservers();
    public void setProperties(float room, float water);
    public void propertiesChanged();
}
