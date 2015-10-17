package Strategy1;

/**
 * Strategy1.AttackBehavior : Strategy1.MagicalAttack
 * Created by HyoJong on 2015-09-19.
 */
public class MagicalAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Magical Attack!!");
    }
}
