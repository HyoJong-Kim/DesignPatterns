package Strategy1;

/**
 * Strategy1.MoveBehavior : Strategy1.NoMove
 * Created by HyoJong on 2015-09-19.
 */
public class NoMove implements  MoveBehavior {
    @Override
    public void move() {
        System.out.println("No Move");
    }
}
