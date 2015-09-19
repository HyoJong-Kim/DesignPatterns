/**
 * AttackBehavior : NoAttack
 * Created by HyoJong on 2015-09-19.
 */
public class NoAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("No Attack");
    }
}
