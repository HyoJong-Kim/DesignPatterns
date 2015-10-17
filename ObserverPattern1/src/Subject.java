/**
 * Created by Answer on 2015-10-03.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
