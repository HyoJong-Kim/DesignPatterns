package Strategy1;

/**
 * Strategy1.MoveBehavior : Strategy1.MeleeMove
 * Created by HyoJong on 2015-09-19.
 */
public class MeleeMove implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Run!!");
    }
}
