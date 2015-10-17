package Strategy1;

/**
 * Strategy1.Character : Super Class
 * Created by HyoJong on 2015-09-19.
 */
public class Character {
    AttackBehavior  attackBehavior;
    MoveBehavior    moveBehavior;

    public Character() {
    }

    public void doAttack()
    {
        attackBehavior.attack();
    }

    public void setAttackBehavior(AttackBehavior behavior)
    {
        attackBehavior = behavior;
    }

    public void doMove()
    {
        moveBehavior.move();
    }

    public void setMoveBehavior(MoveBehavior behavior)
    {
        moveBehavior = behavior;
    }

    public void display()
    {
        System.out.println("Display Character");
    }
}
