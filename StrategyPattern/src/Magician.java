/**
 * Character : Magician
 * Created by HyoJong on 2015-09-19.
 */
public class Magician extends Character {
    public Magician() {
        attackBehavior  =   new MagicalAttack();
        moveBehavior    =   new MagicalMove();
    }

    @Override
    public void display() {
        System.out.println("Display Magician");
    }
}
