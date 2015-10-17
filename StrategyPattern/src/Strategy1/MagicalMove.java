package Strategy1;

/**
 * Strategy1.MoveBehavior : Strategy1.MagicalMove
 * Created by HyoJong on 2015-09-19.
 */
public class MagicalMove implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Blink!!");
    }
}
