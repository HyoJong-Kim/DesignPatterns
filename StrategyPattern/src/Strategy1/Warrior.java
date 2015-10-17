package Strategy1;

/**
 * Strategy1.Character : Strategy1.Warrior
 * Created by HyoJong on 2015-09-19.
 */
public class Warrior extends Character {
    public Warrior() {
        attackBehavior  =   new PhysicalAttack();
        moveBehavior    =   new MeleeMove();
    }

    @Override
    public void display() {
        System.out.println("Display Warrior");
    }
}
