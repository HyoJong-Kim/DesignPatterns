/**
 * Strategy1.Character : Strategy1.Warrior
 * Created by HyoJong on 2015-09-19.
 */
public class Warrior implements Character {
    public Warrior() {
    }

    @Override
    public void doAttack() {
        System.out.println("Physical Attack!!");
    }

    @Override
    public void doMove() {
        System.out.println("Run!!");
    }

    @Override
    public void display() {
        System.out.println("Display Warrior");
    }
}
