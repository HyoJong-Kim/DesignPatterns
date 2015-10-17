package Strategy1;

/**
 * Strategy1.AttackBehavior : Strategy1.PhysicalAttack
 * Created by HyoJong on 2015-09-19.
 */
public class PhysicalAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Physical Attack!!");
    }
}
